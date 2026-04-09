package Aula8_Java.Lutador;

public class Luta{
    Lutador desafiante;
    Lutador desafiado;
    private int rounds;
    private boolean aprovado;


    public void marcarLuta(Lutador l1, Lutador l2) {

        if (l1.getCategoria().equals(l2.getCategoria())
                && l1.getPeso() >= 52.2 && l1.getPeso() <= 120.0
                && l2.getPeso() >= 52.2 && l2.getPeso() <= 120.0
                && l1 != l2) {

            this.desafiante = l1;
            this.desafiado = l2;
            this.aprovado = true;

            System.out.println("Luta marcada entre " + l1.getNome() + " e " + l2.getNome());

        } else {
            this.aprovado = false;
            System.out.println("A luta não pode acontecer.");
        }
    }


    public void lutar() {

        if (this.aprovado) {

            System.out.println(":::::::::: Lutar ::::::::::");

            desafiado.apresentar();
            desafiante.apresentar();

            int resultado = (int)(Math.random() * 3);

            if (resultado == 0) {
                System.out.println("Empate!");
                desafiado.empatarLuta();
                desafiante.empatarLuta();

            } else if (resultado == 1) {
                System.out.println("\n!!!!!!!!  "+desafiado.getNome() + " venceu! !!!!!!!");
                desafiado.ganharLuta();
                desafiante.perderLuta();

            } else {
                System.out.println("\n!!!!!!!!  "+desafiante.getNome() + " venceu! !!!!!!!");
                desafiante.ganharLuta();
                desafiado.perderLuta();
            }

        } else {
            System.out.println("A luta não pode acontecer!");
        }
    }

}
