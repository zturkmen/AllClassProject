package day07_IfStatements;

public class ValidTriangle {
    public static void main(String[] args) {

        /*
        1. A triangle is valid if the sum of all the three angles is equal to 180 degrees. Write
        a program that declares three integers as angles and check whether a triangle is valid or not.
         */
        double angle1= 30;
        double angle2=50;
        double angle3=60;

        short sumOfAngles= (short)(angle1+angle2+angle3);

        boolean validTraingle =sumOfAngles == 180;

        if(validTraingle) {


            System.out.println("The shape is a triangle");
        }
        if(!validTraingle) {

            System.out.println("The shape is not a valid triangle");

        }

        /*   baska bir cozum
        int angleA=100;
          int angleB=50;
            int angleC=30;
           if(angleA+angleB+angleC!=180){System.out.println("This shape is not a triangle!");}
           if (angleA+angleB+angleC==180){System.out.println("This shape is a trinangle");
    }
         */

    }
}
