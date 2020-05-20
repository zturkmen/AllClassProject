package Resources;

import day42_Inheritance.Accessmodifiers;

public class Inheritance2 extends Accessmodifiers {
          //  subclas               superclass
 /*
 publicVariable
 protectedVariable

 // default ve private cannot call

 publicMethod
 protectedMethod
  */

    public static void main(String[] args) {
        System.out.println(Inheritance2.publicVariable);
        System.out.println(Inheritance2.protectedVariable);

       // System.out.println(Inheritance2.defaultVariable);  only same package
      //  System.out.println(Inheritance2.privateVariable);   never call to outside

        Inheritance2.publicMethod();
        Inheritance2.protectedMethod();
      //  Inheritance2.defaultMethod();  canot
      //  Inheritance2.privateMethod();   cannot



    }



}
