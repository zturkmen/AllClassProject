package day26_MethodOverloading;

public class Frequency {
    public static void main(String[] args) {
        /*

         */
        String str="AAA";
        char ch='A';

        char[] arr=str.toCharArray();    // [A,A,A]        // kac tane char A var  String AAA da

        int count=0;        //1+1+1

        for(char each:arr) {   // 3    each: A A A                        // every single each index

         if( each==ch){                                     // char not executed contains. contains just string executed
             count++;

         }

        }
        System.out.println(count);



    }

    public static int frequency(String str, char ch){
        char[] arr=str.toCharArray();
        int count=0;
        for(char each: arr){
            if(each==ch){
                count++;
            }
        }
        return count;
    }
}
