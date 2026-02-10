package Introducao_Aula;

import java.util.Scanner; // Linking with a Library

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fat =1;
        int num;
        System.out.println("Inform a value:");
        num = sc.nextInt();

        for(int i=1; i<=num;i++){
            fat*=i;

        }
        System.out.println(fat);
    }
}
