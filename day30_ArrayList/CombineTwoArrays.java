package day30_ArrayList;

import java.util.ArrayList;

public class CombineTwoArrays {
    /*
    5. write a program that can combine two String arrays into one arrayList
    		ex:
    			arr1 = {"A", "B", "C"};
    			arr2 = {"D", "E", "F", "G"};
    			list ==> {"A", "B", "C", "D", "E", "F", "G"}
     */
    public static void main(String[] args) {
        /*
        KENDI COZUMUM
        String [] arr1 =  {"A", "B", "C"};

        String [] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> list3 = new ArrayList<>();

        for(int i = 0; i < arr1.length; i++){
            list3.add(arr1[i]);
        }


        for(int i = 0; i < arr2.length; i++){
            list3.add(arr2[i]);

        }
        System.out.println(list3);
         */


        String[] arr1 = {"A", "B", "C"};
        String[]  arr2 = {"D", "E", "F", "G", "H", "I"};

        ArrayList<String> list = new ArrayList<>();  //  {"A", "B", "C", "D", "E", "F", "G"}

        for(int i=0; i < arr1.length ; i++ ){
            String eachElement = arr1[i];
            list.add( eachElement );  //arr1[i];
        }

        for(String eachElement : arr2  ){
            list.add(eachElement);
        }



        System.out.println(list);






    }
}
