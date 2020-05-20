package IntervievQuestions;

public class String_RemoveDuplicates {
    public static void main(String[] args) {

        /*
        Write a return method that can remove the duplicated values from String

Ex:  removeDup("AAABBBCCC")  ==> ABC
         */
        /*
        1. result gerekiyor
        2. saydir loop ile
        3. her bir index contains etmiyorsa sonuca ekle
        4.butun indexi resulte ekle
        5. sonucu yazdir
         */


        String str="AAABBBCCC";
        String result="";

        for(int i=0; i<str.length();i++){
            if(!result.contains(""+str.charAt(i))){
                result+=str.charAt(i);
            }
        }
        System.out.println(result);




    }
}
