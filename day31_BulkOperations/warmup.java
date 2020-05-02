package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class warmup {
    public static void main(String[] args) {
        /*
        warmup tasks:
	Write a program that can move all the zeros to  last indexes of ArrayList
		Ex:
			list:  {1,0,2,0,3,0,4,0};
			output: [1, 2, 3, 4, 0, 0, 0, 0]
			DO NOT USE SORT method, DO NOT declear  any extra lists
	*/

        ArrayList<Integer> list=new ArrayList<>((Arrays.asList(0,0,2,0,3,0,4,0)));

        for(int i = 0; i < list.size(); i++){
            if(list.get(i)== 0) {
                list.remove(i);
                list.add(0);

            }
        }
        list.remove(0);
        System.out.println(list);


/*write a program that can return the duplicated values from an ArrayList of String
		Ex:
			list: {"A", "B", "A", "C", "D"};
			output: ["A"]
			list: {"A", "B", "B", "C", "D", "D"};
			output: ["A", "C"]
         */

     ArrayList<String> list1=new ArrayList<>(Arrays.asList("A", "B", "A", "C", "D"));

      for(int i=0;i<list1.size();i++){
          int count=0;
          for(int j=0; j<list1.size(); j++){


              if(list1.get(j)==list1.get(i)){
                  count++;
              }
          } if(count==2){
              System.out.println(list1.get(i));
              break;
          }

      }

        ArrayList<String> list2=new ArrayList<>(Arrays.asList("A", "B", "B", "C", "D", "D"));
        for(int i=0;i<list2.size();i++) {
            int count = 0;
            for (int j = 0; j < list2.size(); j++) {


                if (list2.get(j) == list2.get(i)) {
                    count++;
                }
            }
            if (count ==1) {
               System.out.print(list2.get(i)+" ");

            }


        }



    }
}
