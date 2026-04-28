package Aula10_Java;

public class MainVeterinaria {

    public static void main(String[] args) {
        Animal[] arrayAnimais = new Animal[2];


        arrayAnimais[0] = new Cachorro("Max");
        arrayAnimais[1] = new Gato("Gato de Schrödinger");


        System.out.println(":::::::::::: Consulta Veterinária :::::::::::::::");

        for (Animal animal : arrayAnimais){

            animal.emitirSom();
        }


        System.out.println("\n\n\n\n::::::::::Reação do Cachorro ::::::::::::::::\n\n");
        Cachorro max = new Cachorro("Max");

        System.out.println(">>Cachorro so reagindo :");
        System.out.println(max.reagir());
        System.out.println("\n>>Dando comida e carinho: ");
        System.out.println(max.reagir("Comida"));
        System.out.println(max.reagir("carinho"));
        System.out.println("\n>>As horas: ");
        System.out.println(max.reagir(20));
        System.out.println(max.reagir(12));
        System.out.println(max.reagir(11));

    }

}
