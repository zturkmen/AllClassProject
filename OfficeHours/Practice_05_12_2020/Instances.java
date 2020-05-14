package OfficeHours.Practice_05_12_2020;

import org.w3c.dom.ls.LSOutput;

public class Instances {
    String name;                         // instance variable

    // if there is no specifier(static) instance method oluyor


  /*  {
        name = "Zuura";                                      // instance block  ogrenmeme gerek yok
    }
*/

    public static void main(String[] args) {
        Instances obj=new Instances();
        obj.name="Zuura";
        System.out.println(obj.name);
    }


    public void printName(){                      // instance method
      //  int name=100;      // local variable
     //   System.out.println("Name is : "+name);            // eger icerde local variable varsa bnu sekilde cagirinca local variableden aliyor eger this yoksa
        System.out.println("Name is : "+this.name);        // intastance variabledne geliyor name this oldugu icin

    }


}
