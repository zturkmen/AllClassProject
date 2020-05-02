package day20_ArraysContinue;

import java.util.Arrays;

public class denme {
    public static void main(String[] args) {

        int arr1[]={1,2,3};
        int arr2[]={4,5,6,7};
        int arr3[]=new int[arr1.length+arr2.length];

        int count=0;

        for(int i=0;i<arr1.length;i++){
           // arr1[i]=arr3[count];
            arr3[count]=arr1[i];
            count++;

        }
        for(int a=0; a<arr2.length; a++){
            //arr2[a]=arr3[count];
            arr3[count]=arr2[a];
            count++;
        }
        System.out.println(Arrays.toString(arr3));

        System.out.println("==================================");













    }
}
