package Exercicio1;

public class AlunoMain {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();

        aluno1.setNome("Arthur Moura");
        aluno1.setSaldo(20000.99);
        aluno1.setSaldo(-50.0);


        System.out.println(":::::::::::::::::::::::::::::");

        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Saldo: " + aluno1.getSaldo());


    }
}
