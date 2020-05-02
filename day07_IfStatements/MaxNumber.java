package day07_IfStatements;

public class MaxNumber {
    public static void main(String[] args) {
        /*
        2. write a java program that accepts three numbers and return the maximum number
				(assume that none of them are equal)
         */

        double a =100.5;
        double b= 200.5;
        double c= 300.5;

        boolean aGreater = a>b && a>c;   // if a is greater than b and c, then a is the maximum number
        boolean bGreater = b>a && b>c;   // if b is greater than both a and c then b is maximum number
       // boolean bGreater2 = b>a|| b>c;  // if b is greater than either a and c then b is maximum   that s why we use &&
        boolean cGreater = c>a && c>b;  // if c is greater than both a and b then c is maximum

        if(aGreater){
            System.out.println(a+ " is greater number");
        }
        if(bGreater) {

            System.out.println(b + "is greater number");
        }
        if(cGreater){
            System.out.println(c+ "is greater number");
        }






    }
}
