package Aula5_Java;

public class Funcionario {
    private String name;
    private int age;
    private float wage;

    Funcionario(String name, int age, float wage){
        this.name = name;
        this.age = age;
        this.wage = wage;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public  void setName(String name){
        this.name = name;
    }

    public float getWage(){
        return wage;
    }

    public void setWage(float wage){
        this.wage = wage;
    }


}
