package day13_StringClass;

public class StringLiterals {
    public static void main(String[] args) {
        String str1="Cat";
        String str2=new String("Cat");
        System.out.println(str1+" : "+str2);
        System.out.println(str1==str2);

        String str3="Cat";

        System.out.println(str1==str3);

        String str4=new String("Cat");
        System.out.println(str2==str4);
        System.out.println("==============================================");

        String s1= "Java";
        s1="JavaScript";

        System.out.println(s1);

        String s2="Java";

        System.out.println(s1==s2);



    }
}
