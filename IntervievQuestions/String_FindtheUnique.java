package IntervievQuestions;

public class String_FindtheUnique {

    public static void main(String[] args) {

        /*
        Write a return  method that can find the unique characters from the String

Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";

         */
        /*
       1. empty result string ver
       2. nested loop ile ikisinide yazdir
       3. countu en son loop a verki iki condir=tino sagladiginda eklesin
       4. iki looptaki indexleri birbirine esitleyice countu eklesin
       5.if count==1 ise result ver
         */

        String str="AAABBBCCCDEF";

        String result="";

        for(int i=0; i<str.length();i++){
            int count=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)==str.charAt(i)){
                    count++;
                }
            }
            if(count==1){
                result+=str.charAt(i);
            }

        }
        System.out.println(result);













    }
}
