package day22_Arrays_Python;

public class calisma2 {
    public static void main(String[] args) {
        /*
        *2.  Write a program that can print out the unique values from an int Array
        Ex:
            if arr -> {1,1,2,3,3}
            output: 2
            if arr -> {1,2,2,3,4,4}
            output:  1  3

         */

        int [] arr={1,1,2,3,3};

        //int count=0;
         for(int each:arr){
           int  count=0;                                            // eger uste verirsem yanlis oluyor sonuc
             for(int i=0; i<arr.length; i++){
                 if(each==arr[i]){
                     count++;
                 }

                 }if(count==1){
                 System.out.println(each);
             }

         }


        System.out.println("=========================================");

        int [] arr1={1,2,2,3,4,4};

        //int count=0;
        for(int each:arr1){
            int  count1=0;
            for(int i=0; i<arr1.length; i++){
                if(each==arr1[i]){
                    count1++;
                }

            }if(count1==1){
                System.out.println(each);
            }

        }



    }
}
