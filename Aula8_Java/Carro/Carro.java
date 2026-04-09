package Aula8_Java.Carro;
public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private Motor propulsor; // agregação


    public Carro(String marca, String modelo, int ano, Motor propulsor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.propulsor = propulsor;
    }


    public void exibirFichaTecnica() {
        System.out.println("=== Ficha Técnica ===");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);

        System.out.println("--- Motor ---");
        System.out.println("Fabricante: " + propulsor.getFabricante());
        System.out.println("Potência: " + propulsor.getPotencia() + " CV");
        System.out.println("Combustível: " + propulsor.getTipoCombustivel());
    }
}
