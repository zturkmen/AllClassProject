package day40_Encapsulation;

public class Test {
    public static void main(String[] args) {
        Encapsulation obj=new Encapsulation();

     //  System.out.println(obj.SSN);    //only access same class other not accessable

        // there is a way to access private variable Encapsulation

        System.out.println(obj.getSSN());    //0     // bununla ancak ulasabiliyoruz

       // obj.SSN=123456;   //  i can not access directly

       // obj.setSSN();   error cunku need arg
        obj.setSSN(123456);
       // System.out.println(obj.SSN);   cant access directly

        System.out.println(obj.getSSN());   //123456



    }
}
