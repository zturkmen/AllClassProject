package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZeros {
     /*
        warmup tasks:
	Write a program that can move all the zeros to  last indexes of ArrayList
		Ex:
			list:  {1,0,2,0,3,0,4,0};
			output: [1, 2, 3, 4, 0, 0, 0, 0]
			DO NOT USE SORT method, DO NOT declear  any extra lists
	*/
     public static void main(String[] args) {

         ArrayList<Integer>list=new ArrayList<>();

         list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));
         System.out.println(list);

         int count=0;

         for(Integer each:list){            // how many 0 we have
             if(each==0){
                 count++;
             }
         }
         System.out.println(count);   //4

         list.removeAll(Arrays.asList(0));    // butun sifirlari sildim
         System.out.println(list);         //[1, 2, 3, 4]
       //  list.add(0);          4 defa boyle yapmam lazim ama coksa eklenecek 0 kullanamam
         for(int i=0; i<count; i++){
             list.add(0);   // yukarida count 4 buldum ve o kadar eklemek icin yaptim

         }

         System.out.println(list); //[1, 2, 3, 4, 0, 0, 0, 0]








     }
}
