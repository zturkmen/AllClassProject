package day22_Arrays_Python;

import java.util.Arrays;

public class calisma {
    public static void main(String[] args) {

        /*
        write a program that can count the even and odd number from an array of integers
						MUST use for each loop and continue statement
 */
          int [] arr={1,2,3,4,5,6,7,8,9,10,11};

          int countodd=0;
          int counteven=0;

          for(int each:arr){
              if(each%2==0){
                  counteven++;
                //  continue;            // aslinda else yapmayip sadece continue yaparakta ben ayni sonucu alabiliyorum.
              }else {
                  countodd++;
              }
          }
        System.out.println(counteven);
        System.out.println(countodd);


          /*
     Task01:
        1. create an int array called numbers that has length of 100
        2. assign 1~100 to the array' each indexes
        3. use for each loop to print out all the even numbers.
                Must use continue statement
     */

          int [] numbers= new int[99];

          for(int i=0; i< numbers.length;i++){
              numbers[i]=i+1;

          }System.out.println(Arrays.toString(numbers));




          for(int each:numbers){
              if(each%2==0){
                  System.out.print(each+" ");
              }
          }
        System.out.println("===================================================");


          String sentence="i like java and javascrip";

          sentence=sentence.toLowerCase();
          int countjava=0;
          int countpython=0;
          String [] words=sentence.split(" ");
          for(String each:words){
              if(each.contains("java")){
                  countjava++;

              }
              if(each.contains("python")){
                  countpython++;


              }
          }
        System.out.println(countjava);

        System.out.println(countpython);
        System.out.println(countjava==countpython);






    }
}
