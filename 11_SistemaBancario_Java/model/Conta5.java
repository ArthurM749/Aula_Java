package br.com.sistemabancario.model;

import br.com.sistemabancario.exceptions.SaldoInsuficienteException;

public abstract class Conta5 {

    private int numeroAgencia;
    private int numeroConta;
    private String nomeCliente;
    private double saldo;

    public Conta5(int numeroAgencia, int numeroConta, String nomeCliente, double saldo) {
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public int getNumeroAgencia() { return this.numeroAgencia; }
    public void setNumeroAgencia(int numeroAgencia) { this.numeroAgencia = numeroAgencia; }
    public int getNumeroConta() { return this.numeroConta; }
    public void setNumeroConta(int numeroConta) { this.numeroConta = numeroConta; }
    public String getNomeCliente() { return this.nomeCliente; }
    public void setNomeCliente(String nomeCliente) { this.nomeCliente = nomeCliente; }
    public double getSaldo() { return this.saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    public void sacar(double valor) {
        if (valor > this.saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para o saque de R$ " + valor);
        }
        this.saldo -= valor;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void imprimir() {
        System.out.println("::::: Informações ::::::");
        System.out.println("Número Agência: " + getNumeroAgencia());
        System.out.println("Número Conta: " + getNumeroConta());
        System.out.println("Nome: " + getNomeCliente());
        System.out.println("Saldo: " + getSaldo());
    }
}