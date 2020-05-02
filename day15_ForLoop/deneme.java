package day15_ForLoop;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        /*
         write a program to idenfiy if a string is palindrome or not. if yes==> true,.otherwise ==> false
                level ==> level ==> palindrome
         */
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your word");
        String word=input.next();
        String wordP = "";
         for(int a = word.length()-1; a>=0; a--){

              wordP+=word.charAt(a);

         }

         if(word.equals(wordP)){
             System.out.println(word + " is palindrome" );
         }else{
             System.out.println(word + " is not palindrome");
         }





    }
}
