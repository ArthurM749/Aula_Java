package Aula3_Java;

public class PessoaPrincipal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();

        pessoa1.altura = 190f;
        pessoa1.cor = "Transparente";
        pessoa1.nacionalidade = "Brasileiro";
        pessoa1.peso = 70f;

        System.out.println(":::::::::::::::::");
        System.out.println(">Informações da Pessoa:");
        System.out.println("Altura: "+ pessoa1.altura);
        System.out.println("Cor: "+ pessoa1.cor);
        System.out.println("Nacionalidade: "+ pessoa1.nacionalidade);
        System.out.println("Peso: " + pessoa1.peso);
    }
}
