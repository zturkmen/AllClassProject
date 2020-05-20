package IntervievQuestions;

public class String_Reverse {
    public static void main(String[] args) {

/*
Write a return method that can reverse  String

Ex: Reverse("ABCD"); ==> DCBA
 */
      /*
      1. string empty ver
      2. tersten for lopp ile kelimeyi yazdir
      3. butun idexi sonuca ekle
      4. sout yap sonucu

       */

         String str="ABCD";
         String reverse="";

         for(int i=str.length()-1;i>=0;i--){
             reverse+=str.charAt(i);

         }
        System.out.println(reverse);


    }
}
