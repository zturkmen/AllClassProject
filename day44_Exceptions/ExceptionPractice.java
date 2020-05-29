package day44_Exceptions;

public class ExceptionPractice {
    public static void main(String[] args) {

        try{
            System.out.println("hello");
            System.out.println("holla");

            System.out.println(9/0);    // hata vermiyor bunu run etmiyor

            System.out.println("cybertek");           // bunlari yazdircak
            System.out.println("java");

        }catch(Exception e){
           // System.out.println("cybertek"); // eger usttekiler yoksa bunlarin aynisi ilk 2 yi ve bunlari verecek atlayacak buraya
           // System.out.println("java");

        }


    }
}
