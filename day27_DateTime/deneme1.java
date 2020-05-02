package day27_DateTime;

import java.util.Arrays;

public class deneme1 {

   // public static void main(String[] args) {

   // }
/*
    public static int wordCount(String words) {
        int count=0;
        // saydirmam lazim
        String wordCount="foo bar";
        String[] newword1=words.split(" ");    // kelimelere ayiriyor
        int wordCount1=newword1.length;
        return wordCount1;
    }
    public static void main(String[] args) {
       // wordCount("foo bar");
      int num2= wordCount(words2);
        System.out.println();
    }
*/
public static String reverse(String input)
{
    String reverse="";
    for(int i=input.length()-1; i>=0;i--){
        reverse+=input.charAt(i);

    }return reverse;

}
    public static void main(String[]args){
        String reverse=reverse("food");
        System.out.println(reverse);

    }

}

