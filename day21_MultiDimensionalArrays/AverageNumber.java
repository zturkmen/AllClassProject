package day21_MultiDimensionalArrays;

public class AverageNumber {
    public static void main(String[] args) {
        /*
        1. write a program that can return the average number from an array of integers
			ex:
				[1,2,3]
				average: 2
				[10, 15, 5, 6]
				average: 9
				[4, 5, 6, 7, 8, 10, 20, 30, 0]
				average: 10
				average: sum of all numbers \length

         */
        int [] arr = {10,15,5,6};
        int sum = 0;
        for(int i = 0;  i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum/4);

        /*   other solution

        int length =arr.length;
        int sum=0;
        for(int i=0; i<length;i++){
        int eachNum=arr[i];
        sum+=eachNum;
        System,out,println(sum);
        System.out.println(sum/length);                     if you want decimal number just change  int to double

         */






    }
}
