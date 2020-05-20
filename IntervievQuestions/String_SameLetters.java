package IntervievQuestions;

import java.util.Arrays;

public class String_SameLetters {
    public static void main(String[] args) {
        /*
        1. arraya cevir
        2. sirala
        3. saydir
        4. herbirini stringle ekle farkli oldugu icin yeni resulta
        5. esit olup olmadigini string manipulasyonle yap(equals)
         */


        String str1="abc";
        String str2="cab";


        char[] arr1=str1.toCharArray();    // sadece array e ceviriyorum String i
       // System.out.println(arr1);
        char[] arr2=str2.toCharArray();

        Arrays.sort(arr1);    // siraliyor
        Arrays.sort(arr2);
      // System.out.println(arr1);
      //  System.out.println(arr2);

        String result1="";
        String result2="";

        for(char each:arr1){
            result1+=each;
        }

        for(char each:arr2){
            result2+=each;
        }

        System.out.println(result1.equals(result2));
        //== kullanmazsin boolen verecgi icin sonuc equals sonucu boolen veriyor




    }
}
