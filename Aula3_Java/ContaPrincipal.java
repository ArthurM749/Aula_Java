package Aula3_Java;

public class ContaPrincipal {
    static void main(String[] args) {
        Conta conta1 = new Conta();

        conta1.agencia = "1337-77";
        conta1.nomeCliente = "Arthur Moura";
        conta1.numeroConta = 198761234;
        conta1.tipoConta = "Corrente";
        conta1.limite = 10000.00f;
        conta1.nomeBanco = "UBS Group";
        conta1.saldo = 20000.00f;

        System.out.println("::::::::::::::::::::::");
        System.out.println("Banco - " + conta1.nomeBanco + "\n______________________");
        System.out.println("Bem vindo " + conta1.nomeCliente + "!");
        System.out.println("Número da conta: "+conta1.numeroConta);
        System.out.println("Número Agência: " + conta1.agencia);
        System.out.println("Limite: " + conta1.limite);
        System.out.println("Tipo de conta: "+ conta1.tipoConta);

        System.out.println("Saldo Total: " + conta1.saldo);
        System.out.println("\n-----------------------");
        System.out.println("\nVeja o histórico da sua conta:\nV.V.V.V.V.V.V.V.V.V.V.V\n\n");

        conta1.depositar(5000.00f);
        conta1.sacar(10000.00f);
        conta1.transferir(500.00f);
        conta1.pagar(2000.00f);
    }
}
