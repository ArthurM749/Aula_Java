package br.com.sistemabancario.view;

import br.com.sistemabancario.exceptions.SaldoInsuficienteException;
import br.com.sistemabancario.model.*;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Lab05Sistema {

    private ArrayList<Conta5> listaContas = new ArrayList<>();

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Lab05Sistema sistema = new Lab05Sistema();
        sistema.exibirMenu();
    }

    public void exibirMenu() {
        Scanner sc = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n::::: Menu :::::");
            System.out.println("1-Cadastramento");
            System.out.println("2-Saque");
            System.out.println("3-Depósito");
            System.out.println("4-Consultar");
            System.out.println("5-Atualizar Rendimentos");
            System.out.println("0-Sair");

            opcao = lerOpcaoMenu(sc, 5, "Escreva a opção");

            switch (opcao) {
                case 1 -> executarCadastramento(sc);
                case 2 -> executarSaque(sc);
                case 3 -> executarDeposito(sc);
                case 4 -> executarConsulta(sc);
                case 5 -> executarAtualizacaoJuros();
                case 0 -> System.out.println("Sistema Encerrando...");
                default -> System.out.println("Opção Inválida!");
            }
        }
        sc.close();
    }



    public int lerInteiroSeguro(Scanner sc, String msg) {
        while (true) {
            System.out.println(msg + ": ");
            String entrada = sc.nextLine().strip();
            try {
                int valor = Integer.parseInt(entrada);
                if (valor > 0) return valor;
                System.out.println("Valor inválido. Digite um número maior que zero.");
            } catch (NumberFormatException e) {
                System.out.println("ERRO: Informe somente valores numéricos inteiros.");
            }
        }
    }

    public int lerOpcaoMenu(Scanner sc, int totalOpcoes, String msg) {
        while (true) {
            System.out.println(msg + ": ");
            String entrada = sc.nextLine().strip();
            try {
                int valor = Integer.parseInt(entrada);
                if (valor >= 0 && valor <= totalOpcoes) return valor;
                System.out.println("Opção inválida. Digite entre 0 e " + totalOpcoes + ".");
            } catch (NumberFormatException e) {
                System.out.println("ERRO: Informe somente valores numéricos inteiros.");
            }
        }
    }

    public double lerDoubleSeguro(Scanner sc, String msg) {
        while (true) {
            System.out.println("Digite o valor do " + msg + ": ");
            String entrada = sc.nextLine().strip().replace(",", ".");
            try {
                double valor = Double.parseDouble(entrada);
                if (valor > 0) return valor;
                System.out.println("Valor inválido. Digite um valor maior que zero.");
            } catch (NumberFormatException e) {
                System.out.println("ERRO: Informe somente valores numéricos.");
            }
        }
    }



    public Conta5 buscarContaPorNumero(int numeroProcurado) {
        for (Conta5 conta : listaContas) {
            if (conta.getNumeroConta() == numeroProcurado) {
                return conta;
            }
        }
        return null;
    }

    public Conta5 obterContaValidada(Scanner sc) {
        int numeroConta = lerInteiroSeguro(sc, "Digite o número da conta");
        Conta5 conta = buscarContaPorNumero(numeroConta);
        if (conta == null) {
            System.out.println("ATENÇÃO: Conta não encontrada!");
        }
        return conta;
    }



    private void executarCadastramento(Scanner sc) {

        System.out.println("\n::::: Cadastro :::::");

        int numeroConta = lerInteiroSeguro(sc, "Digite o número da conta");

        if (buscarContaPorNumero(numeroConta) != null) {
            System.out.println("ERRO: Já existe uma conta cadastrada com este número.");
            return;
        }

        int agencia = lerInteiroSeguro(sc, "Digite a Agência");

        System.out.println("Digite o nome do cliente: ");
        String nome = sc.nextLine().strip();

        double saldo = lerDoubleSeguro(sc, "saldo inicial");

        boolean confirmar = confirmarOperacao(sc, "Cadastro");
        if (!confirmar) return;

        Conta5 novaConta;

        if (agencia < 1000) {
            novaConta = new ContaRemunerada5(agencia, numeroConta, nome, saldo);
        } else if (agencia <= 5000) {
            novaConta = new ContaCorrente5(agencia, numeroConta, nome, saldo);
        } else {
            double limite = lerDoubleSeguro(sc, "limite");
            novaConta = new ContaCorrenteEspecial5(agencia, numeroConta, nome, saldo, limite);
        }

        listaContas.add(novaConta);
        System.out.println("Cadastro realizado com sucesso!");
    }

    private void executarSaque(Scanner sc) {
        System.out.println("\n::::: Saque :::::");
        Conta5 conta = obterContaValidada(sc);
        if (conta == null) return;

        double valor = lerDoubleSeguro(sc, "Saque");
        boolean confirmar = confirmarOperacao(sc, "Saque");
        if (!confirmar) return;

        try {
            conta.sacar(valor);
            System.out.println("Saque realizado com sucesso!");
        } catch (SaldoInsuficienteException e) {
            System.out.println("ATENÇÃO: " + e.getMessage());
        }
    }

    private void executarDeposito(Scanner sc) {
        System.out.println("\n::::: Depósito :::::");
        Conta5 conta = obterContaValidada(sc);
        if (conta == null) return;

        double valor = lerDoubleSeguro(sc, "Depósito");
        boolean confirmar = confirmarOperacao(sc, "Depósito");
        if (!confirmar) return;

        conta.depositar(valor);
        System.out.println("Depósito realizado! Saldo atual: " + conta.getSaldo());
    }

    private void executarConsulta(Scanner sc) {
        System.out.println("\n::::: Consulta :::::");
        Conta5 conta = obterContaValidada(sc);
        if (conta == null) return;
        conta.imprimir();
    }

    private void executarAtualizacaoJuros() {
        System.out.println("\n::::: Atualizar Rendimentos :::::");
        for (Conta5 conta : listaContas) {
            if (conta instanceof IContaCorrenteInterface5 contaRendeJuros) {
                contaRendeJuros.calcularJuros();
                System.out.println("Juros aplicados na conta: " + conta.getNumeroConta());
            }
        }
        System.out.println("Atualização concluída!");
    }

    private boolean confirmarOperacao(Scanner sc, String operacao) {
        System.out.println("Confirmar operação " + operacao + "? (s/n)");
        String resposta = sc.nextLine().strip();
        boolean confirmar = resposta.equalsIgnoreCase("S");
        if (!confirmar) {
            System.out.println("Operação " + operacao + " cancelada pelo usuário!");
        }
        return confirmar;
    }
}