package day25_MethodsRecap;

import Resources.Library;

public class calisma2 {

    public static void main(String[] args) {            // Sadece notlar var code calismadi
     /*   String str = "AABBCC";  //A2B2C2                   //day 19 da var baska ornek
        String NonDup1 = Library.RemoveDuplicates(str);    //ABC    library den bunun kodunu cagirdik
        String result = "";

        //  String ch=""+Nondup.charAt(0);    //A       // sadece birinci icin yaptik butun cumleyi yazmiyor
        //  int num=Library.Frequency(str,ch);            // charAt(0)   ilk index icin kulladik sadece
        //  System.out.println(ch+num);

        for (int i = 0; i < NonDup1.length(); i++) {            // kelimenin tamamini yazdirmak icin kullandik
            String ch = "" + NonDup1.charAt(i);
            int num = Library.Frequency(str, ch);            // output is A2B2C2
            result+=ch + num;
        }
        System.out.println(result);

        /*   baska bir yolu yapmanin
        string result="";
        for(int i=0; i<Nondup.length(); i++){
            String ch=""+Nondup.charAt(i);
            int num=Library.Frequency(str,ch);
           result+=ch+num;
        }
        System.out.print(result);       // ayni sonucu aliyorsun



         */


       /* public static String FrequencyOfChars (String str){
            String NonDup =  Library.RemoveDuplicates(str)  ;             //ABC
            String result ="";      //coantisn the frequency of chars

            for(int i =0; i < NonDup.length();i++){
                String ch = ""+NonDup.charAt(i);//  "A"
                int num =  Library.Frequency(str, ch);
                result += ch+num;
            }
            return result;

        }
        */

    }

}

