package day33_CustomClass;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ExtractChars {
    /*
    3. write a program that can extract the sepecial characters, digits and alphebets from a string and stores them into seperate ArrayLists of Character:
            ex:
                str = "ABCD123$%#@&456EFG!";
                list1: {$, %, #, @, &, !}
                list2: {A, B, C, D, E, F, G}
                list3: {1, 2, 3, 4, 5, 6}
        DO NOT USE LAMBDA

     */

    public static void main(String[] args) {
        String str="ABCD123$%#@&456EFG!";
        char[] arr=str.toCharArray();

        ArrayList<Character>letters=new ArrayList<>();    //isletter() class
        ArrayList<Character>digits=new ArrayList<>();
        ArrayList<Character>specialChars=new ArrayList<>();

        for(char each:arr) {                               // every collection of data  every single element of char
          if(Character.isLetter(each)){                  // isAlphabetic == isLetter the same
              letters.add(each);
          }
          if(Character.isDigit(each)){
              digits.add(each);
          }
          if(!Character.isLetterOrDigit(each)){
              specialChars.add(each);
          }
          /*

          else{
          specialChars.add(each);   bunu if(!Character.isLetterOrDigit(each)){  yerine kullanabilirsin

           */


        }

        System.out.println(letters);   //[A, B, C, D, E, F, G]
        System.out.println(digits);    //[1, 2, 3, 4, 5, 6]
        System.out.println(specialChars);  //[$, %, #, @, &, !]

        /*
        other solution
        String str="ABCD123$%#@&456EFG!";

        ArrayList<Character> listOfDigits = new ArrayList<>();

        ArrayList<Character> listOfLetters = new ArrayList<>();


        ArrayList<Character> listOfSpecials = new ArrayList<>();

        for(int i=0; i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                listOfDigits.add(str.charAt(i));
            }
            if(!Character.isLetterOrDigit(str.charAt(i))){
                listOfSpecials.add(str.charAt(i));
            }
            if(Character.isLetter(str.charAt(i))){
                listOfLetters.add(str.charAt(i));
            }

        }

        System.out.println(listOfSpecials);
        System.out.println(listOfLetters);
        System.out.println(listOfDigits);

         */




    }
}
