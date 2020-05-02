package day19_Arrays;

import java.util.Scanner;

public class deneme3 {
    public static void main(String[] args) {

      //write a program that asks "enter a name" 10 times, and store each of the names in the array students

        Scanner input=new Scanner(System.in);
        String [] names= new String[10];


        for(int i=0; i<10; i++){
            System.out.println("Enter a name");
            names[i] = input.next();
        }
        for(int a=0; a<names.length; a++){
            System.out.println(names[a]);

        }






    }
}
