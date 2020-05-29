package day44_Exceptions;

import java.util.NoSuchElementException;

public class multi_catchBlocks {
    public static void main(String[] args) {

      //  System.out.println(100/0);   // ArithmeticException:  ama getmessage yaparsamn sana sonucu gosterir neden oldugu
       // System.out.println("====================================");

    /*    try{
            System.out.println(100/0);
        }catch(ClassCastException e){
            System.out.println("class cast");
        }
        // still expections bundan sonrada

        System.out.println("===============================================");
       */

        try{
            System.out.println(100/0);
        }catch(ClassCastException e){
            System.out.println("class cast");
        }catch(NoSuchElementException e){
            System.out.println("index out of bound");
        }catch (IndexOutOfBoundsException e){
            System.out.println("index out of bound");
        }catch(ArithmeticException e){
            System.out.println("aritmetic");
        }catch (RuntimeException e){         // eger super class sonda degilde ortalarda olursa compiler error veriyor
            // yani bu bir ustte olsa sonda child class olsa hata olacak

            System.out.println("runtime");
        }

        // output aritmetic cunku orda catch yapiyor yani ilkinde hata neyse onu handle edene kadar deniyor ve
        // run ediyor onu ama olmazsa sonuc super class i veriyor

        // eger runtime ve expection varsa hatayi zaten run time yakaladigi icin onu yazdiriyor yani sonuc da super
        // class expection bile olsa ilk yakaladigi run time oluyor


    }
}
