package day30_ArrayList;

import java.util.Arrays;

public class SumOfDigits {

      /*  1. write a program that can return the sum of all the digits from a string
        ex:
        input: "a1b2c3"
        output: 6
        (1+2+3= 6)
        input: "Today's date is 04/27/2020"
        output: 17
        (0+4+2+7+2+0+2+0=17)
        HINT: on ascii table, the characters between #48 ~ #57 are digits

       */
        public static void main(String[] args) {

           String str="a1b2c3";
           char[] arr=str.toCharArray();   // every single character from the char

            System.out.println(Arrays.toString(arr));    // [a, 1, b, 2, c, 3]
            int sum=0;         // i need to add sum all number // will contain sum of digits
            for(char each:arr){
               boolean isDigit=each>=48 && each <=57;         // if craccter is digit

                if(isDigit){   // or if(each>=48 && each<=57)  boolean yerine
                  sum+=  Integer.parseInt(""+each);   // first '0'   stringe cevirmeliyiz
                }
            }
            System.out.println(sum);


// second solution    with Character.isDigit();
           /*
            if(Character.isDigit(each))   ==  if(each>=48 && each<=57)
             is digit()  : identifies if the given character is digit
                 sum+=  Integer.parseInt(""+each);        Bu sekilde de yapabilirsin

*/
             //   boolean a=Character.isAlphabetic('A');   identifies if the cracter is alphabet


    }


}
