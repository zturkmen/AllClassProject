package day32_Predicate;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsMethods {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));

        int max = Collections.max(list);
        System.out.println(max);

        int min = Collections.min(list);
        System.out.println(min);

        /*
            1. write a program that can return the second maximum number from Arraylist
                    Ex: {1,2,3,4,5,6,7,8,8};
                            output: 7
            2. write a program that can return the second minimum number from Arraylist
                Ex: {1,1,2,3,4,5,6,7,8,8};
                   output: 2
         */

        System.out.println("=================================");

        ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(1,1,3,4,4));

        Integer maxnum= Collections.max(numbers);    //4

        numbers.removeAll(Arrays.asList(maxnum));
        System.out.println(numbers);   // 1 1 3


        int seconmax=Collections.max(numbers);
        System.out.println(seconmax);            // 3

        System.out.println("============================================");




        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,1,2,3,4,5,6,7,8));

       // Collections.min(list2);   ilk boyle yaziyorum ama int e cevirmem assign etmem gerekoyir

        Integer minnumber=Collections.min(list2);

        list2.removeAll(Arrays.asList(minnumber));   // collection type oldugu icin arrays.aslist yapiyorum bir tanesi degil butun min numberleri atsin diye
        System.out.println(list2);   //[2, 3, 4, 5, 6, 7, 8]

        int secondmin= Collections.min(list2);
        System.out.println(secondmin);               //2


        System.out.println("======================================================");

        ArrayList<Integer> list3=new ArrayList<>();
        list3.addAll(Arrays.asList(1,2,3,4,5));
        //                         0        4
        // we need {5,2,3,4,1}

        System.out.println(list3); //{1,2,3,4,5}

        Collections.swap(list3, 0, 4 );    // {5,2,3,4,1}

        System.out.println(list3);

        System.out.println("==========================================================");
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Omer", "Omer", "Mary", "Sha", "Fatih", "Omer"));  // Irina

           /*
            names.set(0, "Irina");
            names.set(1, "Irina");
            names.set(5, "Irina");
            */
        Collections.replaceAll(names, "Omer", "Irina" );
        System.out.println(names);




















    }







}
