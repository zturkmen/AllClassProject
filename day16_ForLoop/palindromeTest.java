package day16_ForLoop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class palindromeTest {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Enter your words");
        String word =input.nextLine();
        String reverseword="";

        for(int i = word.length()-1; i>=0; i-- ){
            reverseword+=word.charAt(i);
        }

        System.out.println(reverseword);

        boolean palindrome=word.equals(reverseword);
        System.out.println(palindrome);





    }
}
