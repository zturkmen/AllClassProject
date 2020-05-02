package day27_DateTime;

import java.util.Scanner;

public class intPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num){
        //WRITE YOUR CODE HERE
        String reverse="";
        String num1=""+num;

        for (int i=num1.length()-1; i>=0;i--) {
            reverse += num1.charAt(i);
        }
            if(num1.equals(reverse)){
                System.out.println("true");
            }else{
                System.out.println("false");

        }



    }
}
