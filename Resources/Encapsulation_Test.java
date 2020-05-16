package Resources;

import day40_Encapsulation.Encapsulation;

public class Encapsulation_Test {
    public static void main(String[] args) {    // let me try get and set in here

        Encapsulation obj = new Encapsulation();   // bunu import ederek ancak ulasabiliyorsun

       // Encapsulation_Test obj2=new Encapsulation_Test();
      //  obj2.SSN=1000;

      //  System.out.println(obj.SSN);  i cant access directly
        System.out.println(obj.getSSN());    //0


        // modify ederek set method kullaniyorsun
        obj.setSSN(123);
       System.out.println(obj.getSSN());   // with wrg ile kullanabiliyorsun  GET olarak not SET



    }
}