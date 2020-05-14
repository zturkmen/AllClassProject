package OfficeHours.Practice_05_12_2020;

public class Student {

    /*
    Student:
    ins variables:name, id
    instance methods: toString
     */


    String name;
    long id;
    static String schoolName="Cybertek";
    // always one copy for all object in students class dan cagirdiginda
        // static means class member
    // instance is belong to the object

    public String toString(){              // if you use instance method use instance method
        // instance method      da sttaic kelimesi yok
        // static method    static only except static

        return "Name: "+name+", id: "+id+", School name: "+schoolName;
        // buraya school name ekledigimde printoutta butun objegin yanina ayni ismi ekliyor
    }



}

// static mean that only one copy thats sjharder by object

// eger instance method kullanmayacaksam static method kullaniyorum

class studentObjects{
    public static void main(String[] args) {
        Student student1=new Student();
        student1.name="Madina";                      // instance variableden geliyor
        student1.id=123;

        Student student2=new Student();
        student2.name="Emrah";
        student2.id=456;
        student1.schoolName="Harvard";            // oncesinde Cybertek di ama bunu ekleyince harvard olarak degisti

        Student studen3=new Student();

        System.out.println(student1);
        System.out.println(student2);

        System.out.println(studen3);           // buraya tanimlama yapmadighim icin null ve 0 verecek


    }
}
