package day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Reverse {

    /*
    2. write a program that can print the list of integers in reversed order
		ex:
			list=> {1,2,3,4,5}
			output: 5 4 3 2 1
     */
    public static void main(String[] args) {
        ArrayList<Integer>List=new ArrayList<>();
        for(int i=1;i<6;i++){           // numaradan basladim not index
            List.add(i);
        }
        System.out.println(List);  // [1, 2, 3, 4, 5]

        for(int i=List.size()-1;i>=0;i-- ) {                               // each loop not use because not change
          // List.get(i);         // returns integer
            int eachNum=List.get(i);            // unboxing
          //  Integer eachNum=List.get(i);    kullanabiliriz bunuda

            System.out.print(eachNum+" ");

        }

          // you can do this way too
        ArrayList<Integer> reversedList = new ArrayList<>();
        for( int i = List.size()-1;  i >= 0; i--){
            int eachNum = List.get(i);  // unboxing
            reversedList.add(eachNum);
        }

        System.out.println(reversedList);            // List.get(i) instead of reversedList  int eachnum commet etmelisin ama




    }

}
