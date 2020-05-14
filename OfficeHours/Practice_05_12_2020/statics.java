package OfficeHours.Practice_05_12_2020;

public class statics {

    int instanceVariable=100;
    static int staticVariable=200;

    public static void staticMethod(){           // sttaic method sadece static variableleri cover ediyor digerlerini kabul etmiyor

     //   instanceMethod();
      //  System.out.println(instanceMethod);
        System.out.println(staticVariable);
    }

    public void instanceMethod(){              // hepsini cover ediyor
        staticMethod();
        System.out.println(staticVariable);
        System.out.println(instanceVariable);
    }

    public static void main(String[] args) {             // also static

      //  System.out.println(instanceVariable);   error inst oldugu icin variable
        System.out.println(staticVariable);
        staticMethod();
      //  insanceMethod(); doesnot except  instance oldugu icin

    }


    /*
    /*
instance method:
    Do not use static when creating method: public void methodName(){}
    can call ALL static variables and methods
    can call ALL instance variables and other methods
static method:
    must use STATIC word when creating method: public static void methodName(){}
    can call ONLY static variables and methods
    can NOT call instance variables or methods
    main method = static : can call statics - variables and methods
                            can NOT call instance variables and methods directly
                            must create objects to call instance variables/methods through objects
 */



}
