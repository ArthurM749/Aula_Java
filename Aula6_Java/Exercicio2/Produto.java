package Exercicio2;

public class Produto {
    private String nome; // nome
    private int quantidade; // quantidade
    private double valor; // valor unitário

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(int quantidade){
        if(quantidade < 0){
            System.out.println("ERRO: Estoque negativo não existe! Valor foi definido para zero.");
            this.quantidade = 0;
        }else {
            this.quantidade = quantidade;
        }
    }

    public double getValor(){
        return valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public double getValorTotalEmEstoque(){
        return getValor() * getQuantidade();
    }



}
