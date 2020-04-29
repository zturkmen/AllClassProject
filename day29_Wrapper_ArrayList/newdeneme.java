package day29_Wrapper_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class newdeneme {
    public static void main(String[] args) {
/*
2. write a program that can print the list of integers in reversed order
		ex:
			list=> {1,2,3,4,5}
			output: 5 4 3 2 1
 */

        ArrayList<Integer> List = new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        String reverse;
        for (int i = List.size() - 1; i >= 0; i--) {
            reverse = "" + List.get(i);
            System.out.print(reverse);
        }

        /*
        4.	write a program that can find the unique elements from an ArrayList of integers and stores into another list called uniques
    		ex: list==> {1,1,2,3,3,4,5}
    			uniques ==> {2,4,5}
         */
        System.out.println();
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

/*
3. write a program that can print out the unique elements from an int array
		   HINT: store all the unqie elemenbts of array into a list of integers
		   Ex: array==> {1,1,2,3,3,4,5}
		   	   output: {2,4,5}
 */

     /*   ArrayList<Integer> list2 = new ArrayList<Integer>();
        int arr [] =  {1,1,2,3,3,4,5};
        for(int i = 0; i < arr.length; i++){
            int count = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count == 1){
                list2.add(arr[i]);
            }
        }
        System.out.println(list2);

*/

     ArrayList<Integer> List2=new ArrayList<>();

     int arr[]={1,1,2,3,3,4,5};

     for(int i=0;i<arr.length; i++){
         int count=0;

         for(int j=0; j<arr.length;j++){
             if(arr[j]==arr[i]){
                 count++;
             }
         }
         if(count==1){
             List2.add(arr[i]);
         }
     }
        System.out.println(List2);
/*
5. write a program that can combine two String arrays into one arrayList
    		ex:
    			arr1 = {"A", "B", "C"};
    			arr2 = {"D", "E", "F", "G"};
    			list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */

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



    }
}
