
package br.com.sistemabancario.model;

public class ContaCorrenteEspecial5 extends Conta5 {
    private double limite;

    public ContaCorrenteEspecial5(int numeroAgencia, int numeroConta, String nomeCliente, double saldo, double limite) {
        super(numeroAgencia, numeroConta, nomeCliente, saldo);
        this.limite = limite;
    }

    public double getLimite() { return limite; }
    public void setLimite(double limite) { this.limite = limite; }

    @Override
    public void sacar(double valor) {
        if (valor > getSaldo() + limite) {
            throw new br.com.sistemabancario.exceptions.SaldoInsuficienteException(
                    "Saldo insuficiente para o saque de R$ " + valor
            );
        }
        setSaldo(getSaldo() - valor);
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Limite: " + limite);
        System.out.println("Total disponível: " + (getSaldo() + limite));
    }
}