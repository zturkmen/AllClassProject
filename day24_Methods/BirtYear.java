package day24_Methods;

import java.util.Scanner;

public class BirtYear {

    public static void Age(int birthYear){  //2000
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the current year");
        int currentYear = scan.nextInt();

        int age = currentYear - birthYear;

        if(age > 0 && birthYear > 1900 ) {
            System.out.println(age);
        }else{
            System.out.println("Invalid birth year");
        }

    }

    public static void main(String[] args) {


        // Age( 2000 );

        printHelloCybertek(); // Hello Cybertek


    }


    public static void printHello(){

        System.out.println("Hello");

    }

    public static void printCybertek(){
        System.out.println("Cybertek");
    }


    public static void printHelloCybertek(){
        printHello(); // Hello
        printCybertek(); //Cybertek

    }












}
