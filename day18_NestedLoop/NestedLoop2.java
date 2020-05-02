package day18_NestedLoop;

public class NestedLoop2 {
    public static void main(String[] args) {

        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *
         * * * * * * *
         * * * * * * * *
         * * * * * * * * *
         */

        for(int j= 1; j <= 9; j++){

            for(int i =1; i <= j; i++){
                System.out.print("* ");
            }
            System.out.println();

        }


        /*
         * * * * * * * * *
         * * * * * * * *
         * * * * * * *
         * * * * * *
         * * * * *
         * * * *
         * * *
         * *
         *
         */


       /* for(int j=9; j>=1; j--){
            for(int i=1;i<=j;i++){
                System.out.print("* ");
            }
            System.out.println();
        }

        /*
       for(int j =10; j>=1; j--){
    for(int i = 1; i<=j; i++) {
        System.out.print("* ");
    }
    System.out.println();
    }

         */


        System.out.println("==================================================");

        for (int j = 1; j <= 9; j++) {
            for (int i = j; i <= 9; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("======================================================");
        /*
        a
        a b
        a b c
        a b c d
        a b c d e
         */

        for(char z='a'; z<='z'; z++){
            for(char ch='a'; ch <= z; ch++){
                System.out.print(ch+" ");
        }
            System.out.println();

        }









    }
}
