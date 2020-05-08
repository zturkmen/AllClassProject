package day35_Static;

public class Student {      // for CybertekSchool

    String name;
    int id;
    double gpa;
    static String school="Cybertek";




    public  void setInfo(String name, int id, double gpa){    // static ekleyemzsin methoda
        this.name=name;
        this.id=id;
        this.gpa=gpa;

       //  System.out.println(school); tanimlayabilirim static variable oldugu icin


    }

    public static void printSchoolName(){    // instance variable static oldugu icin

        System.out.println("School name is "+school);
    }

    public String toString(){
        return "Name: "+name+", School Name: "+school;
    }










}
