package day21_MultiDimensionalArrays;

public class NestedLoops_Practice {
    public static void main(String[] args) {

        int[][] numbers = {
                {1,2,3},
                {4,5,6,7,8,9},
                {10,11,12,13,14},
                {15,16,17,18,19,20,21}
        };


        // 1.print all even numbers the same line
        //2. count odd numbers ===> return the total odd number
int countodd=0;

        for(int i = 0; i<numbers.length;i++){           // index of 1D arrays
           for(int j=0; j<numbers[i].length;j++){       // index of num of elements in 1D arrays
               int num=numbers[i][j];
               if(num%2==0){
                   System.out.print(num+" ");
               }else{
                   countodd++;
               }

           }



        }

        System.out.println();   // yanian degil altina yazmasi icin
        System.out.println(countodd);//toplam kaca adet var




    }
}
