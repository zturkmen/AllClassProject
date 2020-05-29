package day44_Exceptions;

public class ExceptionHandling {
    public static void main(String[] args) {

        String str="Cybertek";

        try{
            System.out.println(str.charAt(100));
        }catch(RuntimeException e){
            String discription=e.getMessage();
            System.out.println(discription);

        }


        System.out.println("===============================");

       // System.out.println(100/0);
        // run ettiginde eger aritmeticexpection goruyorsan unexpection oluyor
        // try ce catch block yapman lazim alttaki gibi
       // System.out.println("Completed");


        try{
            System.out.println(100/0);
        }catch (ArithmeticException e){
           String discription= e.getMessage();
            System.out.println(discription);  //  / by zero neden geldigini buluyor hatanin

        }
        System.out.println("Completed");
    }
}
