package day14_StringClass;

public class StringManupulations {
    public static void main(String[] args) {

        String str= "I like to learn Java. i like to watch bthe movie Jumanji";
        int a1=str.indexOf("J");
        System.out.println(a1);     // returns the index num of first matching one if we have more than J

        int a2 = str.indexOf("Jum");
        System.out.println(a2);

        int a3= str.indexOf(".")+2;      // (" I")+1   second I index number
        System.out.println(a3);



        String s="I like Java, and I like reading";

        int b1= s.lastIndexOf("I");
        System.out.println(b1);

        String x = "I like Java, Java is fun, Java programming is fun";

        int d1 = x.indexOf("Java is");  // second J' index num
        System.out.println(d1);

        int d2 = x.indexOf(", J")+2;   // second J' index num
        System.out.println(d2);

        int d3 = x.lastIndexOf("J"); // last J' index number
        System.out.println(d3);

        int d4 = x.indexOf("Java p"); // last J' index number
        System.out.println(d4);


        char ch1 =    x.charAt(26);

        System.out.println(ch1);





    }
}
