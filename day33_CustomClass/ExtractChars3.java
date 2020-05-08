package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ExtractChars3 {
    public static void main(String[] args) {



        String  str = "ABCD123$%#@&456EFG!";
        char[]arr=str.toCharArray();
        Character[] ch=new Character[arr.length];
        for(int i=0; i<arr.length;i++){
            ch[i]=arr[i];
        }

      //  System.out.println(ch); hascode veriyor
       // System.out.println(Arrays.toString(ch));  //[A, B, C, D, 1, 2, 3, $, %, #, @, &, 4, 5, 6, E, F, G, !]
        ArrayList<Character> letters = new ArrayList<>(Arrays.asList(ch));   // ch is not primitive
        letters.removeIf(p->!Character.isLetter(p));
        System.out.println(letters);   //[A, B, C, D, E, F, G]


        ArrayList<Character> digits = new ArrayList<>(Arrays.asList(ch));
        digits.removeIf(p->!Character.isDigit(p));
        System.out.println(digits);   //[1, 2, 3, 4, 5, 6]

        ArrayList<Character> specialChars = new ArrayList<>(Arrays.asList(ch));
      //  specialChars.removeIf(p-> Character.isDigit(p) || Character.isLetter(p));    bu sekilde de yapabilirsin
        specialChars.removeAll(letters);
        specialChars.removeAll(digits);
        System.out.println(specialChars);  //[$, %, #, @, &, !]



        // ArrayList<Character> letters = new ArrayList<>(arr);
        // arraylist doesnot support primiteve that s why we did Character[] ch=new Character[arr.length];








    }
}
