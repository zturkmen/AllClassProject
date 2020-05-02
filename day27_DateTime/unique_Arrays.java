package day27_DateTime;

public class unique_Arrays {
    public static void main(String[] args) {
        /*
        3. write a method that can print out the unique elements from an int array
					Ex: {1,1,2,3,3} ==> 2
						{6,6,7,7,8,9} ==> 8 9
		4. write a method that can print out the unique elements from a double array
					Note: Apply method overloading
         */
    int[] arr={1,1,2,3,3};
    //         0 1 2 3 4

        //arr[0]==>1


        for(int each2:arr){
            int count=0;
            for(int each: arr){
                if(each==each2){          // how many time index o occur  kac defa 0 daki rakam sayiyor diye bunu yapiyoruz.
                    count++;               // ama biz butun hepsini saydircaz  o yuzden tek tek degil hepsini saydirmaliyiz
                }
            }

            if(count==1){
                System.out.println(each2);           // eger regular for loop kullansaydim i yazacaktim ama burda sadece each yazdim.
            }
        }




    }

/*
 for(int i=0; i < arr.length; i++){    //  1,1,2,3,3        // other solutin with regular for loop

            int count = 0 ;
            for(int each   :  arr){
                if(each == arr[i]){
                    count++;
                }
            }

            if(count == 1){
                System.out.println(arr[i]);
            }

        }
 */




}
