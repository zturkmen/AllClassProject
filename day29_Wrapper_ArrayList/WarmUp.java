package day29_Wrapper_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class WarmUp {
    /*
    WARMUP TASKS:
	1. write a program that can return the sum of all the digits from a string
			ex:
				input: "a1b2c3"
				output: 6
					(1+2+3= 6)
				input: "Today's date is 04/27/2020"
				output: 17
					(0+4+2+7+2+0+2+0=17)
			HINT: on ascii table, the characters between #48 ~ #57 are digits
	2. write a program that can print the list of integers in reversed order
		ex:
			list=> {1,2,3,4,5}
			output: 5 4 3 2 1
	3. write a program that can print out the unique elements from an int array
		   HINT: store all the unqie elemenbts of array into a list of integers
		   Ex: array==> {1,1,2,3,3,4,5}
		   	   output: {2,4,5}
    4.	write a program that can find the unique elements from an ArrayList of integers and stores into another list called uniques
    		ex: list==> {1,1,2,3,3,4,5}
    			uniques ==> {2,4,5}
    5. write a program that can combine two String arrays into one arrayList
    		ex:
    			arr1 = {"A", "B", "C"};
    			arr2 = {"D", "E", "F", "G"};
    			list ==> {"A", "B", "C", "D", "E", "F", "G"}
     */


    public static void main(String[] args) {
      //warmup 1
     //   Scanner input=new Scanner(System.in);
      //  String word=input.next();
      //  System.out.println(sumfromString(word));

        System.out.println("======================================================");

      //  WarmUp 2

        ArrayList<Integer>List=new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
          String reverse;
        for(int i=List.size()-1;i>=0;i--){
            reverse=""+List.get(i);
            System.out.print(reverse);
        }





    }

        public static int sumfromString(String word) {
            int sum = 0;
            for (int i = 0; i < word.length(); i++) {
                String result = "";
                char ch = word.charAt(i);
                if (ch >= 48 && ch <= 57) {
                    result += ch;
                    sum += Integer.parseInt(result);
                }
            }
            return sum;


        }








}
