package Aula9_Java.Atividade_1;

public class ContaBancaria {

    private double saldo;

    public ContaBancaria(double saldo){
        this.saldo = saldo;
    }

    public void depositar(double valor){
        saldo += valor;
        System.out.printf("\nDepósito feito no valor de " + valor + " !");

    }

    public void consultarSaldo(){
        System.out.println("\nSaldo Atual: " + saldo);
    }


}

class MainContaBancaria{
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(100.00);

        conta1.depositar(2000);
        conta1.consultarSaldo();

    }



}
