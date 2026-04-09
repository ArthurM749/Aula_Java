package Aula8_Java.Carro;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor("Honda", 150, "Gasolina");
        Carro carro = new Carro("Honda", "Civic", 2022, motor);

        carro.exibirFichaTecnica();
    }
}