package day19_Arrays;

import java.util.Scanner;

public class deneme5 {
    public static void main(String[] args) {

        /*Create an array that holds the days
   User should be able to enter the day index and output should be: "Today is Monday"*/

        Scanner input=new Scanner(System.in);

        String[] days=new String[7];
        System.out.println("Enter a Day");
        for(int i=0; i<days.length; i++){
            System.out.println((i+1)+" Day");
            days[i]=input.next();
        }
        for(int i = 0; i < days.length; i++) {
            System.out.println("Today is " + days[i]);
        }













    }
}
