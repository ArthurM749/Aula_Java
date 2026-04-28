package Aula10_Java;

public class Animal {

    protected String name;

    public Animal(String name){
        this.name = name;
    }

    public void emitirSom(){
        System.out.println("Som de Animal");
    }

}

class Cachorro extends Animal{

    public Cachorro(String nome){
        super(nome);
    }

    @Override
    public void emitirSom(){

        System.out.println("Au Au");
    }

    public String reagir(){
        return "Abanar rabo e labe...";

    }

    public String reagir(String valor){
        if (valor == "Comida" || valor == "Passear"){
            return "Pular de Alegria";
        }

        return "Rosnando Grrrrr!!! ";
    }

    public String reagir(int hora){
        if( hora < 12){
            return "Abana Rabo";
        }

        if(hora > 18){
            return "''Ignorando o dono...''";
        }

        return "(Horário está nomal) Au au!!";
    }


}

class Gato extends Animal{

    public Gato(String nome){
        super(nome);
    }

    @Override
    public void emitirSom(){
        System.out.println("Meau");
    }

}