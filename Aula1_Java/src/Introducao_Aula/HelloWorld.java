package Introducao_Aula;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  //
        System.out.println("Eae cara =]");

        int idade;
        float salario;
        Boolean aprovado = true;
        String nome;

        System.out.println("What your name?");
        nome = sc.nextLine();
        System.out.println("What your age?");
        idade = sc.nextInt();
        System.out.println("Inform ur salary:");
        salario = sc.nextFloat();
        aprovado = true;

        System.out.println("\nName: "+ nome);
        System.out.println("\nAge: "+ idade);
        System.out.println("\nSalary: R$"+ salario);
        System.out.println("\nStatus: "+ aprovado);
    }
}
