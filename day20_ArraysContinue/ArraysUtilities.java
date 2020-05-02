package day20_ArraysContinue;
import java.util.Arrays;

public class ArraysUtilities {
    public static void main(String[] args) {

        int[] arr={1,2,3};

        String r = Arrays.toString(arr);
        System.out.println(r);


     //   System.out.println(arr);    Array must be converted to string before


        String names[]={"Madina","Fatih","Osman"};

        System.out.println(Arrays.toString(names));

       // System.out.println(names);   dogrudan bunu yazirirsan bazi sacma kodlar cikiyor


        double[] nums= {10,20,30,40,50};     // double oldugu icin 10.0 gibi yazdiriyor

        System.out.println(Arrays.toString(nums));

        System.out.println(nums[0]);   // veritabanindaki rakami veriyor return  10.0

        System.out.println(nums[0]+1);








    }
}
