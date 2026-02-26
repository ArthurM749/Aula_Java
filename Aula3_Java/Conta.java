package Aula3_Java;

public class Conta {

    String nomeBanco ;
    int numeroConta ;
    String agencia ;
    String nomeCliente ;
    String tipoConta ;
    float saldo ;
    float limite ;

    void passouLimite(float valor){
        if (valor > limite){
            System.out.println("O valor passou do limite permitido!");
        }

    }

    void depositar(float valor){
        saldo += valor;

        System.out.println("Valor depositado: " + valor + "\nTotal: "+ saldo);
        System.out.println("......................");
    }

    void sacar(float valor){
        saldo -= valor;
        passouLimite(valor);
        System.out.println("Valor sacado: " + valor + "\nTotal: "+ saldo);
        System.out.println("......................");
    }

    void transferir(float valor){

        saldo -= valor;
        passouLimite(valor);
        System.out.println("Valor trasferido: " + valor +"\nTotal: " + saldo);
        System.out.println("......................");
    }

    void pagar(float valor){

        saldo -= valor;
        passouLimite(valor);
        System.out.println("Valor pago: "+  valor+ "\nTotal: " + saldo);
        System.out.println("......................");
    }

}
