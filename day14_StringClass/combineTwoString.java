package day14_StringClass;

import java.util.Scanner;

public class combineTwoString {
    public static void main(String[] args) {

        /*
        1. Ask user to enter two words. Print the first word, second word, second word, first word
			Input:
				one
				two
			Output:
				onetwotwoone
					DO NOT USE + OPERATOR
         */
        Scanner input=new Scanner(System.in);

        System.out.println("Enter first words");
        String firstword=input.next();

        System.out.println("Enter second words");
        String seconword=input.next();

        String result= firstword.concat(seconword).concat(seconword).concat(firstword);
        System.out.println(result);








    }
}
