package Aula3_Java;

public class VeiculoPrincipal {
    public static void main(String[] args) {
        Veiculo car1 = new Veiculo();

        car1.brand = "Porche";
        car1.model = "911 GTS";
        car1.year = 2018;
        car1.color = "Dark Florest";

        System.out.println("::::::::::::\n" + car1.brand + "\n" + car1.year + "\n" +
                car1.model + "\n" + car1.color);

        System.out.println("..............");

        car1.accelerating();
        car1.moving();
        car1.stop();
    }
}
