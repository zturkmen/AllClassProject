package day39_AccessModifiers;

import org.w3c.dom.ls.LSOutput;

public class calisma {

    //                   INSTANCE VARIABLE

    //int a=10;
    int a;                 // instance variable

    public static void main(String[] args) {              // each object has its own copy of instance variables
        calisma obj1=new calisma();
      //  System.out.println(obj1.a);     // degeri yok cunku
        obj1.a=100;
        System.out.println(obj1.a);

        calisma obj2=new calisma();
        obj2.a=200;
        System.out.println(obj2.a);           // ne kadar object create edersen hepsinin degeri farkli olacak

        calisma obj3=new calisma();
        System.out.println(obj3.a);             // 0 cunku bir rakam tanimlamadin   ama yukarda 10 verirsen degerine ilk 10 veriyor sana

        System.out.println("=================Local variable============================");

        double num=100.5;           // local variable
    }
    public static void method(){
       // System.out.println(num);    you can not acces to local variable because local variable only visible within the method
    }
}
           //               STATIC VARIABLE
class staticvariable {

    static int b=300;

     public static void main(String[] args) {

         staticvariable obj1=new staticvariable();

        // System.out.println(obj1.b);

      //   System.out.println(staticvariable.b);
       // deger tanimlamadan uste verilen static variabledeki degeri otomatik aliyor ama instance variablede deger
         // tanimlaman gerekiyor object create ederken


     }
   }

class staticname{

    static String name;
    int a=20;

    public static void main(String[] args) {
        staticname obj1=new staticname();
        obj1.name="Ela";

        System.out.println(name);        // variable sttaic oldugu icin dogrudan name yazip print edebiliyorsun ama ins variable olsa print edemiyorsun
        System.out.println(obj1.name);  //Ela burda toptu bottim oldugu icin Ela verecek

        staticname obj2=new staticname();
        obj2.name="Azra";

        System.out.println(name);
        System.out.println(obj2.name);    // iki sekilde print eder

        // artik name Azra

        System.out.println(obj1.name);         // once Ela idi ama suanda Azra


        staticname obj3 =new staticname();
       // System.out.println(staticname.a);      ins variable share object not class
        System.out.println(obj3.a);         // 20
    }

// static method only accepts class members





  }

  //                        STATIC AND INSTANCE METHOD
// static method only accepts static features if method is not a static cant call to in static methods ( a main method)

class Ela{


    public static void method1(){
        System.out.println("vay");
       //  Ela.method2();   you cant because of non static

    }

    public void method2(){
        System.out.println("hey");
       // Ela.method1();   you can

    }

    public static void main(String[] args) {
        Ela.method1();
      //  Ela.method2();              you cannot call because method is not static it is instance method.
        // instance methodda obj create etmeden cagiramazsin
        Ela obj=new Ela();
        obj.method2();               // yani ancak bu sekilde obj create ederek cagirabiliyorsun eger static method degilse cagiracagin


    }



}