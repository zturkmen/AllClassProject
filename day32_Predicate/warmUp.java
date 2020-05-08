package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;

public class warmUp {

    public static void main(String[] args) {

    /*
    1. write a program that can return the unique objects from a anArray List of Integers
			Ex:
				list: {1,1,2,3,4,5,5}
				sout(list); ==> {2,3,4};
		Note: 1. DO NOT use any extra arrayList
			  2. DO NOT use any loops
			  3. do not use any sort method
			  4. use predicate only and collections methods only
		Hint:   Collections.frequency() // will return the frequency
				removeIf( frequency == 1)  can keep the unique objects in arrayList
     */


        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.addAll(Arrays.asList(1,1,2,3,4,5,5));

            // Predicate<Integer> lessThan5 = Y -> Y <= 5;   for example from day32

        Predicate<Integer> frequency= i-> Collections.frequency(numbers,i) >1;   // i put i because like each from loop
           //   Hint:   Collections.frequency() // will return the frequency


        numbers.removeIf(frequency);           // remove all frequency numbers if they more than 1


        System.out.println(numbers);          // [2, 3, 4]

    /*    2. write a program that can return the duplicated objects from a an ArrayList of Integers
        Ex:
        list: {1,1,2,3,4,5,5}
        sout(list); ==> {1,1,5,5};
        Note: 1. DO NOT use any extra arrayList
        2. DO NOT use any loops
        3. DO NOT use any sort method
        4. Use predicate and collections methods only
        Hint:   Collections.frequency() // will return the frequency
        removeIf( frequency > 1)  can keep the duplicated objects in arrayList

     */

          ArrayList<Integer> numbers1=new ArrayList<>();
          numbers1.addAll(Arrays.asList(1,1,2,3,4,5,5));

         //   System.out.println(numbers1);   [1, 1, 2, 3, 4, 5, 5]

        Predicate<Integer> nondupnumbers= i-> Collections.frequency(numbers1,i) ==1;     // need nondup numbers that s why i use ==1
         // aslinda buldugum nundup olan yani 2,3,4 olan numaralari bulup sonra onlari remove ediyorum.
        System.out.println(nondupnumbers);
        numbers1.removeIf(nondupnumbers);    // numbers1- nondupnumbers
        System.out.println(numbers1);            //[1, 1, 5, 5]


     /*
     3. task:
			1. create an ArrayList of string called country names
			2. write a program that can remove all the country names that have length of 10 or greater
      */

       ArrayList<String> cNames=new ArrayList<>();

       cNames.addAll(Arrays.asList("Turkey","Turkmenistan","Ozbekistan","Tacikistan","Kirgizistan","United State of America",
               "Iran","Ukrayna","Gurcistan","Meksika","Brezilya","Almanya"));

       Predicate<String> removeCnames=i-> i.length() >=10;

       cNames.removeIf(removeCnames);
        System.out.println(cNames);  //[Turkey, Iran, Ukrayna, Gurcistan, Meksika, Brezilya, Almanya]  bu ulkelerin length leri <10

/*
 4. write a program that can extract the sepecial characters, digits and alphebets from a string and stores them into seperate ArrayLists of Character:
        ex:
        str = "ABCD123$%#@&456EFG!";
        list1: {$, %, #, @, &, !}
        list2: {A, B, C, D, E, F, G}
        list3: {1, 2, 3, 4, 5, 6}
    */


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



    }




}
