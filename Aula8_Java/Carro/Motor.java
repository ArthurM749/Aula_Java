package Aula8_Java.Carro;
public class Motor {
    private String fabricante;
    private int potencia;
    private String tipoCombustivel;

    // Construtor
    public Motor(String fabricante, int potencia, String tipoCombustivel) {
        this.fabricante = fabricante;
        this.potencia = potencia;
        this.tipoCombustivel = tipoCombustivel;
    }

    // Getters
    public String getFabricante() {
        return fabricante;
    }

    public int getPotencia() {
        return potencia;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }
}