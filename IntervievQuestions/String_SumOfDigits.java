package IntervievQuestions;

public class String_SumOfDigits {
    public static void main(String[] args) {
        /*
        Write a method that can return the sum of the digits in a string
         */


        String number="123";

        int total=0;
        char[] arr=number.toCharArray();
        for(char each: arr){
            if(Character.isDigit(each)){
              total+=Integer.valueOf(""+each);    // i didnot get
                //total+=""+each;
             //   total++;  sadece bu sonuc 3 veriyo index toplamini veriyor
            }
        }
        System.out.println(total);


    }
}
