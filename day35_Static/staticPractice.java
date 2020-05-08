package day35_Static;

import java.util.Scanner;

public class staticPractice {
    //when to use static variable instead of instance
     static Scanner scan =new Scanner(System.in);     // sadece buraya tanimlamam yeterli oluyor her ikisindede kullanabiliyorsun
    //  Scanner scan =new Scanner(System.in);   // sadece bunu tanimlarsan without static sadece main methodda kullanamazsiin

    public static void main(String[] args) {
       // Scanner scan =new Scanner(System.in);
        System.out.println("Enter num1");

        int num1=scan.nextInt();
        System.out.println("Enter num2");
        int num2=scan.nextInt();

        System.out.println("sum is: "+(num1+num2));


    }

    public void method1(){
      //  Scanner scan =new Scanner(System.in);
        System.out.println("Enter num1");

        int num1=scan.nextInt();
        System.out.println("Enter num2");
        int num2=scan.nextInt();

        System.out.println("Multiplication is: "+(num1*num2));


    }









}
