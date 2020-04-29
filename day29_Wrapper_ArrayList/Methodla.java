package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class Methodla {

    public static void main(String[] args) {
        ArrayList<Integer>List=new ArrayList<>();
        List.add(5000);
        List.add(200);
        List.add(300);

        int maximum1 = max(List);    // ayni methodlardaki gibi cagirmak
        System.out.println(maximum1);




    }
    public static int max(ArrayList<Integer>List){
        int maximum=Integer.MIN_VALUE;
        for(int i=0; i<List.size();i++){
            if(List.get(i)>maximum){
                maximum=List.get(i);
            }
        }return maximum;
    }









}
