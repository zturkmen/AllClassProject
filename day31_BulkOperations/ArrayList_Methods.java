package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayList_Methods {
    public static void main(String[] args) {

        ArrayList<String>list1=new ArrayList<>();

        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");


        boolean r1=list1.contains("Z");     // Z yok cunku listede
        System.out.println(r1);      // false

        System.out.println("=====================================================");

        ArrayList<String>list2=new ArrayList<>();

        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");

        boolean r2=list1.equals(list2);
        System.out.println(r2);      // true
        // Arrays.equal(arr1,arr2)

        // index numberlarinda ayni olmasi gerekiyor mesela siralari onemli A B C D ise digeride A B C D olmali

        int [] arr1={1,2,3};
        int [] arr2={3,2,1};

        boolean r3= Arrays.equals(arr1,arr2);
        System.out.println(r3);     // false     // ama once sort yaparsam true oluyor
        System.out.println("=============================================");

        ArrayList<Integer>list3=new ArrayList<>();

        list3.add(10);
        list3.add(100);
        list3.add(1000);
        list3.add(20);

        Collections.sort(list3);
        System.out.println(list3);     // [10, 20, 100, 1000]

        for(int i=list3.size()-1; i>=0;i--){
            System.out.print(list3.get(i)+" ");   // 1000 100 20 10
        }
        System.out.println("==================================================");


        ArrayList<Integer> reversedlist3=new ArrayList<>();
        for(int i=list3.size()-1; i>=0;i--){
            reversedlist3.add(list3.get(i));
        }
        System.out.println(reversedlist3);       //[1000, 100, 20, 10]


        list3=reversedlist3;
        System.out.println(list3);         //[1000, 100, 20, 10]    ayni baska bir coum yolu

        System.out.println("===========================================");


        System.out.println(list3.size());         // 4

        list3.clear();   // removes everything, size:0

        boolean r4=list3.isEmpty();
        System.out.println(r4);         // true   cunku once clear yaptim hespsini sildi sonra ici bosmu diye saydirdim















    }
}
