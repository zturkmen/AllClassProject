package day14_StringClass;

import java.util.Scanner;

public class combineTwoString2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        /*
        2. Ask user to enter two words. Print first word without its first character then print the second word without its first character.
			Input:
				apple
				banana
			Output:
				ppleanana
         */
        System.out.println("Enter first words");
        String firstword=input.next();
          firstword= firstword.substring(1);

        System.out.println("Enter second words");
        String seconword=input.next();
          seconword= seconword.substring(1);

        System.out.println(firstword+seconword);



    }
}
