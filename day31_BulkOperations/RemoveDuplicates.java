package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();    // day 18 package
        list.addAll(Arrays.asList(1,1,2,2,3,3));

        ArrayList<Integer>result=new ArrayList<>();   // expected result: [1,2,3]

        for(Integer each:list){           // each: 1,1,2,2,3,3
            if(!result.contains(each)){    // result doesnot contain 1 second time 2. numara boyle devam ediyor
                result.add(each);         // olmayanlari ekliyor sadece yada olanlari
            }
        }
        System.out.println(result);      //[1, 2, 3]

        System.out.println("===========================================");
           /*
           write a program that can remove duplicates from an array of integer

                    do not use for each loop
            */


           Integer [] arr1={1,1,2,2,3,3};

           ArrayList<Integer> nonDuplicates=new ArrayList<>();

           for(int i=0; i< arr1.length;i++){
               if(!nonDuplicates.contains(arr1[i])){    // arr1[i]  yazdim cunku sadece i yazamiyorum.//for Array u always have to use Array variable which is arr1 then u have to add the index
                   nonDuplicates.add(arr1[i]);    // which is i form the loop. which ends up arr1[i]
               }
           }

        System.out.println(nonDuplicates);  //[1, 2, 3]





    }
}
