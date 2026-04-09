package aula8_Java.Lutador;

public class Lutador {
    protected String nome;
    protected String nacionalidade;
    protected int idade;
    protected float altura;
    protected float peso;
    protected String categoria;
    protected int vitorias;
    protected int derrotas;
    protected int empates;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public void apresentar(){
        System.out.println("::::::::::::::::::::::");
        System.out.printf("Nome: %s\n" +
                        "Nacionalidade: %s\n" +
                        "Idade: %d\n" +
                        "Altura: %f\n",
                        nome,nacionalidade,idade,altura);
    }

    public void status(){
        System.out.printf("Peso: %f\n" +
                "Categoria: %s\n" +
                "Vitórias: %d\n" +
                "Derrotas: %d\n" +
                "Empates: %d",
                peso,categoria,vitorias,derrotas,empates);
    }

    public void ganharLuta(){   vitorias++;}
    public void perderLuta(){   derrotas++;}
    public void empatarLuta(){  empates++;}






}
