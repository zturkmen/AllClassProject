package day13_StringClass;

import java.sql.SQLOutput;
import java.util.Scanner;

public class numbertoWords {
    public static void main(String[] args) {
   /*
   2. write a java program that can convert any given numbers between 0 ~ 9 to words,
   if the number is greater than 9 or less than zero, out put should be "Invalid".

    */

        Scanner input=new Scanner(System.in);

        System.out.println("Enter a number between 0 - 9");
        int num = input.nextInt();
        String result=" ";

        switch (num){
            case 0: result = "zero";
            break;

            case 1: result = "one";
                break;

            case 2: result = "two";
                break;

            case 3: result = "three";
                break;

            case 4: result = "four";
                break;

            case 5: result = "five";
                break;

            case 6: result = "six";
                break;

            case 7: result = "seven";
                break;

            case 8: result = "eight";
                break;

            case 9: result = "nine";
                break;

            default: result="invalid";

        }

        System.out.println(result);


        //ternary

        String result2= (num==0)? "zero": (num==1)? "one": (num==2)? "two": (num==3)? "three": (num==4)? "four":
                (num==5)? "five": (num==6)? "six": (num==7)? "seven": (num==8)? "eight": (num==9)? "nine": "invalid";

        System.out.println(result2);







    }
}
