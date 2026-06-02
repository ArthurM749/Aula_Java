
package br.com.sistemabancario.model;

public class ContaRemunerada5 extends Conta5 implements IContaCorrenteInterface5 {
    public ContaRemunerada5(int numeroAgencia, int numeroConta, String nomeCliente, double saldo) {
        super(numeroAgencia, numeroConta, nomeCliente, saldo);
    }

    @Override
    public void calcularJuros() {
        depositar(getSaldo() * TAXA_JUROS);
    }
}