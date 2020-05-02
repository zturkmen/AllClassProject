package day25_MethodsRecap;
import Resources.Library;
public class Test {
    public static void main(String[] args) {


        String str="ABCDABABABABAB";
        String result=Library.RemoveDuplicates(str);

        System.out.println(result);
        String str1="AABBCDEB";
        String str2="B";

      //  Library.Frequency(str1,str2);   boyle yaziyoruz sonra int num1 e aktariyoruz

       int num1= Library.Frequency(str1,str2);
        System.out.println(num1);

    }
}
