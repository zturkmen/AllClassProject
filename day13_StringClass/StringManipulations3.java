package day13_StringClass;

public class StringManipulations3 {
    public static void main(String[] args) {

        String str= "I like Java programming John";

              int num1= str.indexOf("John");

        System.out.println(num1);

        String str2 = "Cybertek school is awesome";
        //             0123456789
        int firstS=str2.indexOf("s");// 9
        int secondS=str2.indexOf("is")+1;
        //    str2.intexOf("is")==> returns the index number of i
        System.out.println(firstS);
        System.out.println(secondS);

        int maxIndexnumber="Cybertek".length()-1;
        System.out.println(maxIndexnumber);

        String names="Muhtar";
          int a1=names.indexOf("Good Guy");
        System.out.println(a1);

        String fullname= "Kuzzat Altay";
        String firstName = fullname.substring(0, fullname.indexOf(" "));
        String lastName = fullname.substring(fullname.indexOf(" ")+1);

        System.out.println(firstName);
        System.out.println(lastName);





    }
}
