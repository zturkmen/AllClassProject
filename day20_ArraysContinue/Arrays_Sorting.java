package day20_ArraysContinue;

import java.util.Arrays;

public class Arrays_Sorting {
    public static void main(String[] args) {

        int[] arr1={9,8,7,6,5,4,3,2,1};

        Arrays.sort((arr1));

        System.out.println(Arrays.toString(arr1));

        System.out.println("First min number is: "+ arr1[0]);

        System.out.println("SEcond minnumber is: "+arr1[1]);

        System.out.println("First max number is: "+arr1[arr1.length-1]);

        System.out.println("Second max number: "+arr1[arr1.length-2]);





        char[] ch={'Z','D','w','Y','A'};
        Arrays.sort(ch);

        System.out.println(Arrays.toString(ch));


        String[] names={"Deniz", "Osman", "Anna","Ali"};      // 2. harfe bakiyor asci table da oyle veriyor
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));


        System.out.println("========================================");

        int[] arr={3,1,4,-1,100,-100,200,155};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));      // kucukten buyuge siraliyor


        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");                    // buyukten  kucuge siraliyor

        }


        System.out.println("========================================");
/*     other way


        int[] arr = {3,1,4,-1,100, -100, 200, 155};
        Arrays.sort(arr);

        int[] arrDesc = new int[arr.length];

        System.out.println(Arrays.toString(arr));

        int j = 0;

        for(int i = arr.length -1;  i >= 0; i--){
            // System.out.print( arr[i] +" ");
            arrDesc[j]  = arr[i];

            j++;
        }


        System.out.println(Arrays.toString(arrDesc));

*/
    }
}
