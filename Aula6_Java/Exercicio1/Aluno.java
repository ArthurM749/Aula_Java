package Exercicio1;

public class Aluno {
    private String nome;
    private double saldo;

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        if(saldo < 0) {
            System.out.println("Erro! Valor negativo é inválido!");
        }else{
            this.saldo = saldo;
        }


    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }




}
