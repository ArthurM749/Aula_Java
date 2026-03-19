package Exercicio3;

public class Sensor {
    private double tempCelsius;

    public void setTemperatura(double tempCelsius){
        if(tempCelsius < -273.15){
            System.out.println("Temperatura abaixo de -273.15 é inválido!");
        }else{
            this.tempCelsius = tempCelsius;
        }
    }

    public double getTemperaturaCelsius(){
        return tempCelsius;
    }

    public double getTemperaturaFahrenheit(){
        return (tempCelsius * 9/5) + 32;
    }
}
