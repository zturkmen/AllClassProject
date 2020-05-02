package day17_WhileLoops;

import java.util.Scanner;

public class Max_Min {
    public static void main(String[] args) {
        /*
        1. write a program that can ask the user "enter a number" five times and return the maximum number
				hint: you will nedd for loop and if statement
	2. write a program that can ask the user "enter a number" five times and return the minimum number
				hint: you will nedd for loop and if statement

         */
        Scanner input =new Scanner(System.in);
        int MaxNumber=-999999999;   // any number the user provided will be greater than this number
                                     // first user entered variable will be initilized to MaxNumber
                             // MaxnNumber=2;

        int MinNumber=1999999999;                                              //******* we use these variable number because of range
        for(int i =1; i<=5; i++){           //1 2 3 4 5
            System.out.println("Enter a number");
            int num=input.nextInt();    //1,3    -2    0

            if(num > MaxNumber){  // to compare each user inputs , and assign the maximum number to MaxNumber
                MaxNumber = num;
            }

            if(num<MinNumber){
                MinNumber=num;
            }



        }

        System.out.println(MaxNumber);
        System.out.println(MinNumber);

/*                                          // output
Enter a number
1
Enter a number
2
Enter a number
5
Enter a number
3
Enter a number
4
5
1

 */



    }
}
