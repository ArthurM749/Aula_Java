package Aula5_Java;

public class User {

    private String name;
    private int age;
    private String dataBorn;


    // ::::::: GET::::::::

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getDataBorn(){
        return dataBorn;
    }

    //::::::::: SET ::::::::::

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setDataBorn(String dataBorn){
        this.dataBorn = dataBorn;
    }



}
