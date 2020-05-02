package day25_MethodsRecap;

import org.w3c.dom.ls.LSOutput;

public class Frequency {
    public static void main(String[] args) {


        String str1 = "AAA";
        String str2 = "A";

        int count = 0;

        while (str1.contains(str2)){

           count++;
           str1= str1.replaceFirst(str2,"");  // we need to make sure we are not counting the same index over again


        }
       // System.out.println(str1);    // bize kac adet varsa onu cikartiyor
        System.out.println(count);      // A dan kac tane var onu yazdiriyor

        String a="AABBBCDEFAA";
        String b="A";
       int num1= Frequency(a,b); // sonuc int olmali cunku methoddan int olarak geliyor
       System.out.println(num1);   // A dan kac tane var onu yazdiriyor

    }
    public static int Frequency(String str1, String str2) {
        int count = 0 ;
        while(str1.contains(str2)){
            count++;
            str1 = str1.replaceFirst(str2, "");
            // we need to make that we are not counting the same index over again
        }
        return count;
    }





}
