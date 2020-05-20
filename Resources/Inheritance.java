package Resources;

import day42_Inheritance.Data;

public class Inheritance extends Data {
              // subclass        superclass

    public static void main(String[] args) {
        System.out.println(Inheritance.publicData);
        System.out.println(Inheritance.protectedData);
        // System.out.println(Inheritance.defaultData);  default not visible outside the package
       // System.out.println(Inheritance.privateData);   private not visible outside

    }

}
