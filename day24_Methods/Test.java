package day24_Methods;

import java.util.Arrays;
import java.util.Scanner;
import Resources.Library;
public class Test {
    public static void main(String[] args) {
        String str="Cybertek";

        String Revstr=Library.Reverse(str);
        System.out.println(str.equalsIgnoreCase(Revstr));

        int[] arr={10000,3000,2000,40000,50000,1000000};
        arr=Library.sortDesending(arr);
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

    }
}
