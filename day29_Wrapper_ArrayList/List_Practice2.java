package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class List_Practice2 {
    public static void main(String[] args) {
          /*
        create a list of Integers
        add 5 Integers to it
        return max number from the list
        ** don't use sort method
         */

        ArrayList<Integer> List=new ArrayList<>();
        List.add(100);
        List.add(20);
        List.add(300);
        List.add(400);
        List.add(50);

       // System.out.println(List.size());            // 5

        // first variable get max number



        int maximum= List.get(0);   // buda ayni        int maximum=Integer.MIN_VALUE;

       // int maximum=Integer.MIN_VALUE;   // 100    300     400           // temp variable, its going to be greater than this number  //bu 0 index demek.

        for(int i=0; i<List.size();i++){         // i: 0,1,2,3,4
            if(List.get(i)>maximum){              // 100 > maximim   eger number buyukse tek tek degisiyor kucukse ayni kaliyor bi oncekinden
                maximum=List.get(i);
            }
        }
        System.out.println(maximum);


       // int maximum=0; baslayamayiz cunku butun numaralar buyuk 0 dan o yuzden ilk index yada minvalue ile basliyoruz



       // for each le yapilmasi


        int maximum1= List.get(0);
        for(Integer each:List){
            if(each>maximum1){          // each cunku her biri zaten var each olarak
                maximum1=each;
            }
        }
        System.out.println(maximum1);


    }





}
