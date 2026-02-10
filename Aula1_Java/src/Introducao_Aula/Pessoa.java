package Introducao_Aula;

public class Pessoa {

    String nome;
    int idade;
    float salario;
    boolean status;

    @Override
    public String toString(){
        return "Nome: "+ this.nome + " Idade: "+ this.idade +" Status: "+ this.status;
    }
}
