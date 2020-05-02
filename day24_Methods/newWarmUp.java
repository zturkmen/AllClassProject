package day24_Methods;

import java.util.Scanner;

public class newWarmUp {
    /*
     1.  write a return method that accepts a String and removes duplicate values from the String
        Ex:
                RemoveDuplicate("aaabbbccc");  ==> "abc"
    2. write a return method that accepts two strings str1 & str2, and returns the frequency of str2 in str1 as an int
        EX:
            Frequency("AAABB", "A");  ==> 3
            Frequency("ABAB", "B"); ==> 2
    3. (This one I will do it too tomorrow in class) Combine above two methods to write a return method that can return the frequencyt of characters as a stringfrom any given string
        Ex:
            FrequencyOfChars("ABABCB"); ==> "A2B3C1";
            FrequencyOfChars("AAABCCCDD") ==> "A3B1C3D2"

     */
    public static void main(String[] args) {
        String word="aaabbbccc";
        System.out.println(removeduplicate(word));


      //  String str1="AAABB","A";
     //  String str2="ABAB","B";

        System.out.println(frequency("AAABB", "A"));
        System.out.println(frequency("ABAB", "B"));




    }

    public static String removeduplicate(String word){
        String removeDuplicate="";
        int count=0;
        for (int i=0; i<word.length();i++){

            if(removeDuplicate.contains(""+word.charAt(i))){
                continue;
            }
            removeDuplicate+=word.charAt(i);

        }return removeDuplicate;

    }

    public static int frequency(String str1, String str2) {

        int count=0;

        for (int i = 0; i < str1.length(); i++) {
            if(str1.substring(i, i + 1).equals(str2)){
                count++;
            }

        }
       return count;

    }
    public static String Frequencyofchars(String str) {   // not working
        String result = "";
        // int count=0;

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == str.charAt(i)) {
                    count++;
                }
            }
            result += "" + str.charAt(i) + count;
            str = str.replace("" + str.charAt(i), "");

        }
        return result;

    }







}
