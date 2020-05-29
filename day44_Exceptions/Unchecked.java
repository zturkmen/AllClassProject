package day44_Exceptions;

public class Unchecked {

    public static void main(String[] args) {
      //  System.out.println(9/0);  //  / by zero  0 olamaz in arithmetic Exception

        String str="Cybertek";

       // System.out.println(str.charAt(-1));

        int [] arr={1,2,3};
        System.out.println(arr[200]);   // exception  200 index yok


        System.out.println("test completed");

    }
}
