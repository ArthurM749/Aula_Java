package Aula2_Java;

public class Conta {
    int numero;
    String nomeCliente;
    float saldo;
    float limite;

    void depositar(float valor) {
        this.saldo += valor;
        System.out.println("Depósito foi realizado!");

    }

    void sacar(float valor){
        this.saldo -= valor;
        System.out.println("Saque foi realizado!");
    }

    float consultaSaldo(){
        return this.saldo;
    }
}