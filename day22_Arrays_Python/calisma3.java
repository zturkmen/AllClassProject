package day22_Arrays_Python;

import java.util.Arrays;

public class calisma3 {
    public static void main(String[] args) {

        /*
        1.  write a program that can check if two Strings are build out of same
        Ex:
            if str1 = "aabbbc";  str2 ="cab";
            output: true
            if str1 ="abcd";  str2 ="abc";
            output: false
            Hint: you will need array and Arrays' methods

         */

        String str1="aabbbc";
        String str2="aabbbc";

       String[] words1 =str1.split(" ");
       String[] words2 =str2.split(" ");

        for(String eachw1:words1){
          //  int count=0;
            for(String eachw2:words2){
               // count++;

            }if(words1!=words2){
                System.out.println("false");
            }else{
                System.out.println("true");
            }
        }







    }
}
