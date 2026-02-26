package Aula2_Java;

public class contaPrincipal {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        minhaConta.nomeCliente = "Arthur Moura";
        minhaConta.saldo = 20000f;
        minhaConta.limite = 10000f;
        System.out.println("Nome cliente: " + minhaConta.nomeCliente);
        System.out.println("Saldo disponível: " + minhaConta.saldo);
        System.out.println("Limite:  R$"+ minhaConta.limite);

        minhaConta.depositar(5000.00f);

        System.out.println("Saldo Atualizado: "+minhaConta.consultaSaldo());

        minhaConta.sacar(7500.00f);
        System.out.println("Saldo Atualizado: "+minhaConta.consultaSaldo());

    }
}
