package day19_Arrays;

import java.util.Scanner;

public class deneme4 {
    public static void main(String[] args) {
        /*
         /*Create an array that holds 12 months names User should be able to enter month index
       and output should be: "The month name is <MonthName>"*/



        Scanner input= new Scanner(System.in);

        String[] monthname= new String[12];

        System.out.println("Enter Month Name");
        for(int i=0; i<=monthname.length-1; i++){
            System.out.println((i+1)+" Month");
            monthname[i]=input.next();

        }
        System.out.println("Months Entered: ");
        for(int i=0; i<monthname.length; i++){
            System.out.println("Month name is: "+monthname[i]);
        }










    }
}
