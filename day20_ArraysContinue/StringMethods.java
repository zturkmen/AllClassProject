package day20_ArraysContinue;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name="Muhtar ";

           char[] characters =name.toCharArray();

        System.out.println(Arrays.toString(characters));    // return deki r, almak icin variablenin sonuna space koy

        System.out.println("=======================================================");
        String str1="Cybertek School";

        String str2= "School Cybertek";

        char[] ch1= str1.toCharArray();
        char[] ch2= str2.toCharArray();

// buyuk kucuk sensetive yapmak istiyorsan touppercase le yap basta diyor
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        boolean equalstr= Arrays.equals(ch1,ch2);                 // ayni karakterdelermi ona bakiyoruz eger dogruysa zaten true verecek siralama degil sadece charactere bakiyor
        System.out.println(equalstr);







    }
}
