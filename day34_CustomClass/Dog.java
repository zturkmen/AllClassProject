package day34_CustomClass;

public class Dog {

    String breed;     // instance variable
    String size;
    int age;
    String color;
    String name;

    public void eating(String food){
        System.out.println(name+" is eating "+food);
    }
    public void drinking(String drink){
        System.out.println(name+" is drinking "+drink);
    }
    public void playing(String toy){
        System.out.println(name+" is playing "+toy);
    }
    public void studying(String subject){
        System.out.println(name+" is studying "+subject);
    }


    public void setDogInfo(String breed,String size,int age,String color, String name){
                             // local variable
        this.breed=breed;     // this is instance variable i gosteriyor.
        this.size=size;       // cevirmene gerek kalmiyor local variable deki isimleri
        this.age=age;
        this.color=color;
        this.name=name;
    } // this keyword is used for calling object instance (instance variables)

    public String toString(){
        return "Dog Name: "+name+", breed: "+
                breed+", size: "+size+", color:"+color+", age: "+age;
    }


}
