package Introducao_Aula;

import java.util.Scanner;

public class mediaNota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float nota1 = 0.0f;
        float nota2 = 0.0f;
        float nota3 = 0.0f;
        System.out.println("Informe nota 1:");
        nota1 = sc.nextFloat();
        System.out.println("Informe nota 2: ");
        nota2 = sc.nextFloat();
        System.out.println("Informe nota 3: ");
        nota3 = sc.nextFloat();

        float media = (nota1 + nota2 + nota3)/3;
        System.out.println("Média Final: "+ media);
    }
}
