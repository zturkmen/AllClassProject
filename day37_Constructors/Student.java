package day37_Constructors;

public class Student {
    // name, age,gender(M/F), and university

    String name;
    int age;
    char gender;
    String university;

    public Student(String name, int age, char gender, String university){    // constructor method bunu create ettiysen setInfo ya gerek yok
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.university = university;
    }


    public void setInfo(String name,int age,char gender,String university){   // constructor yaptiysan buna gerek yok
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.university = university;



    }
    public String toString(){
        return "Name: "+name+" Age: "+age+" Gender: "+gender+" University: "+university;
    }

}
