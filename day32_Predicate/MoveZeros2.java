package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MoveZeros2 {
      /*
        warmup tasks:
	Write a program that can move all the zeros to  last indexes of ArrayList
		Ex:
			list:  {1,0,2,0,3,0,4,0};
			output: [1, 2, 3, 4, 0, 0, 0, 0]
			DO NOT USE SORT method, DO NOT declear  any extra lists
	*/

      // Second solution bir onceki class 1. solution
      public static void main(String[] args) {

          ArrayList<Integer> list=new ArrayList<>();

          list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));
          System.out.println(list);

         int count= Collections.frequency(list,0);    // list in icindeki 0 lari cikardi
          System.out.println(count);     // 4

          list.removeAll(Arrays.asList(0));
          System.out.println(list);      //[1, 2, 3, 4]

          for(int i=0; i<count;i++){
              list.add(0);
          }

          System.out.println(list);   //[1, 2, 3, 4, 0, 0, 0, 0]




      }
}
