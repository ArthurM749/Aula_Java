package Aula9_Java.Atividade_3.RH;

import Aula9_Java.Atividade_3.Base.Funcionario;

public class Gerente extends Funcionario {

    public Gerente(double salario){
        super(salario);

    }


    public void mostrarSalario(){
        System.out.println("\nSalario Total: " + salario);
    }

    public static void main(String[] args) {
        Funcionario func1 = new Funcionario(2000);

        func1.mostrarSalario();

        //Resultado dá Erro.
    }

}
