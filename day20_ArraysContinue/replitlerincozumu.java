package day20_ArraysContinue;


import java.util.Arrays;
import java.util.Scanner;

public class replitlerincozumu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        Warmup tasks:
    Task01:
        1. create an int array called numbers that has length of 100
        2. assign 1~100 to the array' each indexes
        3. use for each loop to rpint out all the even numbers.
                MUst use continue statement
    Task02:
        1. Write a program that will take five Strings and save them into an array called arr.
        2. use for each loop to print out the first three letter of each element of arr, one per line. You can assume that every element of arr is at least 3 letters long.
            Example:
                arr -> ["apple", "banana"]
                prints: app
                        ban
         */

int [] numbers=new int[100];

for(int i=1; i<=numbers.length-1;i++) {
    numbers[i] =i +1;
}
    for (int eachnumbers : numbers) {
        if (eachnumbers % 2!= 0) {               // why this is odd numbers olmasi gerekmiyormu

continue;

        }
        System.out.print(eachnumbers+", ");

    }


        System.out.println("==============================================");

    String firstthreeletter="";
     String [] arr=new String[5];

        arr[5]=input.next();

     for(int i=1; i<arr.length;i++){

     }
     for(String eacharr:arr){
         firstthreeletter=""+eacharr.charAt(0)+eacharr.charAt(1)+eacharr.charAt(2);

     }
        System.out.println(firstthreeletter);











    }
}
