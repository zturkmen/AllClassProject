package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_RemoveAll {
    public static void main(String[] args) {

        ArrayList<Integer> list =new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,1));
        // remove 1,3,5,8

        Integer a=1;
        list.remove(a);
        list.remove(a);

        Integer b=3;
        list.remove(b);
        list.remove(b);

        System.out.println(list);    //[2, 4, 5, 6, 7, 8]

        list.removeAll(Arrays.asList(2));
        System.out.println(list);         //[4, 5, 6, 7, 8]     2 yi cikardi

        System.out.println("=======================================");

        Integer [] arr={3,1,5,8};
        list.removeAll(Arrays.asList(arr));
        System.out.println(list);         // [4, 6, 7]


        System.out.println("=======================================");

        String[] names = {"Ahmed", "John", "Aaron", "Ahmed", "Daniel", "Ahmed", "Ahmed"};

        ArrayList<String> nameList = new ArrayList<>( Arrays.asList(names) );
        System.out.println(nameList);    //[Ahmed, John, Aaron, Ahmed, Daniel, Ahmed, Ahmed]

        nameList.removeAll(  Arrays.asList("Ahmed")  );

        System.out.println(nameList);  // [John, Aaron, Daniel]





        /*
             1. write a program that can remove duplicates from an arraylist
         */

















    }
}
