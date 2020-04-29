package day30_ArrayList;

import java.util.ArrayList;

public class Uniques {
    public static void main(String[] args) {
        /*
        4.	write a program that can find the unique elements from an ArrayList of integers and stores into another list called uniques
    		ex: list==> {1,1,2,3,3,4,5}
    			uniques ==> {2,4,5}
         */

        ArrayList<Integer>List=new ArrayList<>();

        List.add(1);
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(3);
        List.add(4);
        List.add(5);

        ArrayList<Integer>Uniques=new ArrayList<>();

        for(int i=0; i<7;i++){            // we already know size <7   eger fazlaysa asagidaki cozum second
            int count=0;          // how many time occur

            for(Integer each:List){
                if(each==List.get(i)){
                    count++;
                }
            }
            if(count==1){
                Uniques.add(List.get(i));
            }

        }
        System.out.println(Uniques);


    /*
     ArrayList<Integer> list =  new ArrayList<>(); // {1,2,1,3,4}
                    list.add(1);
                    list.add(2);
                    list.add(1);
                    list.add(3);
                    list.add(4);

        ArrayList<Integer> uniques =  new ArrayList<>();


        for(int i =0; i < list.size(); i++){

            int count = 0;
            for(Integer each  : list ){
                if(each == list.get(i) ){  // 0  1 2
                    count++;
                }
            }
            if(count == 1){
                uniques.add(list.get(i)); // 0 1 2
            }


        }


        /*
        for(Integer each2 : list){
            int count = 0;
            for(Integer each  : list ){
                if(each == each2 ){  // 0  1 2
                    count++;
                }
            }
            if(count == 1){
                uniques.add(each2); // 0 1 2
            }
        }
         */
/*
        System.out.println(list);
        System.out.println(uniques);



        // list.get(0) ==> 1

     */


/*
KENDI COZUMUM
ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        ArrayList<Integer> newlist = new ArrayList<Integer>();
        for(int i=0; i<list.size();i++){
            int count=0;
            for(int j=0; j<list.size();j++){
                if(list.get(j)==list.get(i)){
                    count++;
                }
            }
            if(count==1){
                newlist.add(list.get(i));

            }

        }System.out.println(newlist);
 */





    }
}
