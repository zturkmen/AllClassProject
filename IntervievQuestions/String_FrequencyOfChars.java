package IntervievQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class String_FrequencyOfChars {

    /*
    Write a return method that can find the frequency of characters

   Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */

    public static void main(String[] args) {

        String str = "AAABBCDD";
        String result = "";

        String nonDup ="";

        for(int i=0; i <= str.length()-1; i++){

            if(!nonDup.contains( ""+str.charAt(i)) ){
                nonDup += str.charAt(i);
            }

        }



        for(int j = 0 ; j <= nonDup.length()-1; j++ ){
            char ch = nonDup.charAt(j);

            int count = 0;
            for(int i = 0; i <= str.length()-1; i++){
                if(str.charAt(i) == ch){
                    count++;
                }
            }
            result +=   ""+ ch  + count;

        }



        System.out.println(result);








    }


}



