package day27_DateTime;

public class deneme {
    public static void main(String[] args) {


        int[] arr={1,1,2,3,3};       //0 1 2 3 4

        for(int i=0; i<arr.length;i++){
            int count=0;
            for(int each   :  arr){   //1 1 2 3  3
                if(each == arr[i]){
                    count++;
                }
            }

            if(count == 1){
                System.out.println(arr[i]);
            }

        }



    }
}
