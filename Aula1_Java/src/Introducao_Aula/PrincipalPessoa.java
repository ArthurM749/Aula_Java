package Introducao_Aula;

public class PrincipalPessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Arthur";
        pessoa1.idade = 19;
        pessoa1.status = false;

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Bruna";
        pessoa2.idade = 27;
        pessoa2.status = true;

        System.out.println(pessoa1.toString());
        System.out.println(pessoa2.toString());
    }
}
