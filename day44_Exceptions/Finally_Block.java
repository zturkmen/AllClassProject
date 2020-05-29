package day44_Exceptions;

import java.util.NoSuchElementException;

public class Finally_Block {
    public static void main(String[] args) {

        try{
            System.out.println(9/0);
            System.out.println("try block");    // burda hata verdigi icin bu block u yazmiyor hemen oburune atliyor
        }catch(Exception e) {
       // }catch (NoSuchElementException e){  // bunu yazarsan handle etmez bi sonrakine gecer yakalayamadigi icin
            System.out.println("catch block");   // exception handle oldugundada hemen final e atliyor ve onu veriyor
        }finally {
            System.out.println("finally");
        }
      // eger catch blockta handle edilirse finally atliyor oinuda veriyor eger orda handle olmazsa
        // finally veriyor ve exception veriyor


        // eger handle  ediyorsan finanlly ihtiyac yok
        // eger finally block before catch block yazarsan compiler error verir
        // catch yazmadan finally yazarsanda hata almazsin ama dogru degil kullanmak


    }
}
