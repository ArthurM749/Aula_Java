package aula8_Java.Lutador;

public class Main {
    public static void main(String[] args) {

        Lutador l1 = new Lutador();
        l1.setNome("Popo");
        l1.setNacionalidade("Outro Mundo");
        l1.setIdade(999);
        l1.setAltura(1.60f);
        l1.setPeso(95f);
        l1.setCategoria("Médio");
        l1.setVitorias(50);
        l1.setDerrotas(2);
        l1.setEmpates(3);

        Lutador l2 = new Lutador();
        l2.setNome("Donald");
        l2.setNacionalidade("Estados Unidos");
        l2.setIdade(40);
        l2.setAltura(1.20f);
        l2.setPeso(60f);
        l2.setCategoria("Médio");
        l2.setVitorias(20);
        l2.setDerrotas(25);
        l2.setEmpates(5);

        Luta luta = new Luta();

        luta.marcarLuta(l1, l2);
        luta.lutar();

        System.out.println("\n::::: STATUS FINAL :::::::\n");
        System.out.println(l1.getNome());
        l1.status();
        System.out.println("\n\n---------------------\n");
        System.out.println(l2.getNome());
        l2.status();
    }
}