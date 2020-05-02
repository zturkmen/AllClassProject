package day21_MultiDimensionalArrays;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String array [] =new String[5];
        for (int i = 0; i<array.length; i++){
            array [i]= scan.next();
        }
        for (String each : array){
          String firstthreeletter=""+each.charAt(0)+each.charAt(1)+each.charAt(2);
            System.out.println(firstthreeletter);
        }
    }
}
