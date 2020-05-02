package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Uniques {
    public static void main(String[] args) {
        // write a program that can return the unique objects from arraylist of characters

        Character[] chars={'A','A','B','C','D','D'};

        ArrayList<Character>charlist=new ArrayList<>(Arrays.asList(chars));
        System.out.println(charlist);   //[A, A, B, C, D, D]

        ArrayList<Character> result=new ArrayList<>();   // [B,C]      i need


        for(int i=0; i<charlist.size();i++){
            int count= Collections.frequency(charlist,charlist.get(i));
            if(count==1){
                result.add(charlist.get(i));
            }
        }

        System.out.println(result);            //[B, C]


        /*
        other solution


        for(Character each: charList ){ // each: A, A, B, C, D, D

            int count = Collections.frequency(charList, each);
            if(count == 1){
                result.add( each );
            }

        }



        System.out.println(result);

         */
















    }
}
