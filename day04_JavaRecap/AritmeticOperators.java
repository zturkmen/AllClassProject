package day04_JavaRecap;

public class AritmeticOperators {

    public static void main(String[] args) {
        int a =10/3;    //3
        System.out.println(a);

        System.out.println(10/4);   // 2 because of int

        double d = 10/4;
        // double d = 2;
        // d==>2.0
        System.out.println(d);    // 2

        System.out.println(10.0 /4 );  //2.5
        System.out.println(10/4.0);   //2.5

        System.out.println(10.0/4.0);  //2.5


        boolean evenNumber = 25 % 2==0;

        System.out.println(evenNumber);
        System.out.println(25%2);

        boolean oddNumber = 22 % 2 !=0 ;

        System.out.println(oddNumber);

        System.out.println(10%2 == 0);
        System.out.println(11%2!=0);

        System.out.println("25 is odd number:" + (25%2!=0));

        System.out.println("10 is even number :" + (10%2==0));
        System.out.println("11 s even number :" + (11%2==0));

        System.out.println("25 is odd number:"+(15%2 !=0));



    }
}
