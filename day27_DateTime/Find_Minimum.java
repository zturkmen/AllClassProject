package day27_DateTime;

public class Find_Minimum {
    /*
    1. write a return method that can return the minimum number from an int array
		2. write a return method that can return the minimum number from a double array
					NOTE: apply method overloading,  DO NOT USE SORT METHOD.

     */
    public static void main(String[] args) {
        int[] arr = {5, 4, 7, 5};
        int minimum = arr[0];

        for (int each : arr) {                 // each 5,4,7,5    //day 20 de detayli var
            if (each < minimum) {
                minimum = each;
            }
        }
        System.out.println(minimum);   //1.cozum



        int[] arr2 = {100, 2000, 3000, 40, 50, -100, -9000};  //2.cozum int methodlar
        System.out.println(minimum(arr2));



        double[]arr3={55.,10.5,1.5,2.5,0};                //3.cozum overloading
        double num1=minimum(arr3);
        System.out.println(num1);



    }

    public static int minimum(int[] arr) {                 // sort da kullanarak yapabilirsin
        int minimum = arr[0]; //4

        for (int each : arr) {  // 5,4,7,5
            if (each < minimum) {
                minimum = each;
            }
        }
        return minimum;
    }

    public static double minimum(double[]arr){             // overloading   int methodla ayni sadece double olarak cevirdik
        double minimum = arr[0]; //4

        for (double each : arr) {  // 5,4,7,5
            if (each < minimum) {
                minimum = each;
            }
        }
        return minimum;
    }







}