package Aula5_Java;

import java.util.Scanner;

public class FuncionarioMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = "Anonymous";
        int age = 19;
        float wage = 20000.0f;

        System.out.println(":::::::::::::::::::::::::::::::::::::");

        Funcionario funcionario = new Funcionario(name, age, wage);

        System.out.println(funcionario.getName());
        funcionario.setName("Arthur");

        System.out.println(funcionario.getName());
        double novoSalario = funcionario.getWage() * 1.10;
        funcionario.setWage((float) novoSalario);

        System.out.println(funcionario.getWage());



    }
}
