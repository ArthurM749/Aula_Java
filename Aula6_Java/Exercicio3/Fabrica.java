package Exercicio3;

public class Fabrica {
    public static void main(String[] args) {

        Sensor s1 = new Sensor();
        s1.setTemperatura(-500.20); // Isso é fisicamente impossível!


        System.out.println("Temp C°: " + s1.getTemperaturaCelsius());
        System.out.println("Temp F°: " + s1.getTemperaturaFahrenheit());
    }
}
