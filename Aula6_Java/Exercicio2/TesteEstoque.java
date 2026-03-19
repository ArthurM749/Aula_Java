package Exercicio2;

public class TesteEstoque {
    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.setNome("Teclado Mecânico");
        p1.setQuantidade(-5); // ERRO: Estoque negativo não existe!
        p1.setValor(150.0);

        System.out.println(":::::::::::::::::::::::::::::::::::::::::");

        System.out.println("Produto: " + p1.getNome() + " | Total: R$ " + p1.getValorTotalEmEstoque());
        System.out.println("Quantidade: " + p1.getQuantidade());
    }
}
