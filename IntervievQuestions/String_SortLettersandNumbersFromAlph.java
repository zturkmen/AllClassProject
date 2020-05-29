package IntervievQuestions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class String_SortLettersandNumbersFromAlph {
    public static void main(String[] args) {
        /*
        Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers, sort the individual string and append them back together

Ex:

Input:  "DC501GCCCA098911"    herbirini kendi icinde sirala diyor

OutPut: "CD015ACCCG011899"
         */

        String str1="DC501GCCCA098911";
        String str2="";

      /*  char[]chars=str1.toCharArray();
        Arrays.sort(chars);
       // System.out.println(chars);
        String str2=String.valueOf(chars);
        System.out.println(str2);
       */











/*
        for(int i=0; i<str1.length();i++){
            str2+=""+str1.charAt(i);
            if(Character.isAlphabetic(str1.charAt(i)) && i<str1.length()-1){
                if(Character.isDigit(str1.charAt(i+1))){
                    str2+=",";
                }
            }

            if(Character.isDigit(str1.charAt(i)) && i<str1.length()-1 ){
                if(Character.isAlphabetic(str1.charAt(i+1))){
                    str2+=",";
                }
            }


        }
        System.out.println(str2);  // DC,501,GCCCA,098911

      //  String [] arr=str2.split(",");
        //    System.out.println(str2);
        String[] arr=str2.split(",");
        str1="";             // siralama yapmasini sagliyor
       // System.out.println(arr);
        for(String each:arr){
            char[] arr2=each.toCharArray();
            Arrays.sort(arr2);
           // System.out.println(arr2);  altalta veriyor

            for(char each2:arr2){
                str1+=""+each2;
            }
        }
        System.out.println(str1);







*/



    }
}
