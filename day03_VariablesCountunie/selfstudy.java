package day03_VariablesCountunie;

import java.util.Scanner;

public class selfstudy {

    public static void main(String[] args) {

       /* variables practice:







//===========================================================================================//
/*
Task01:
        create a class called KgTopounds, and write a program that can convert Kg to pound and print the result
                Ex:
        kg = 10;

        output:
        10 kg is equal to 22.0462 pounds
                kg = 20
        output:
        20 kg is equal to 44.0925 pound
 */

       int kg = 10;
       double dif1 = 2.20462;

        System.out.println(kg+" "+"kg is equal to"+" "+dif1*kg+" "+"pounds");
         int kg1 = 20;
         double dif2 = 2.204625;

        System.out.println(kg1+" "+"kg is equal to"+" "+dif2*kg1+" "+"pound");

        System.out.println("==================================================================================");
        /*
        Tasks02:
        create a class called LittersToGalons, and write a program that can convert litters to galons and print out the result
         */
        int lit =5;
        double dif6 = 2.5;
        double litgal = lit/dif6;

        System.out.println(litgal);
        System.out.println("===============================================================================");

        /*
         Task03:
        create a class called PoundsToKg , and write a program that can convert pounds to kg
         */
       // double pounds =1.8;
        double kg2= 10;
        double dif= 2;
        double poundstokg= kg2/dif;
        System.out.println(poundstokg);

        System.out.println("===================================================================================");
     /*
      Task04:
        create a class called GalonsToLitters, and write a program that can convert the gallons tto litters
     */
       double gal1 = 5;
     double gallit = dif6*gal1;
        System.out.println(gallit);

        System.out.println("=======================================================================================");

        /*
         task 05:
        create a class called LiraToUSD, and write a program that can convert lira to dollars, and print the result
                Ex:
        if Lira = 1000;
        output:
        1000 Liras is equal to 160.97 USD
        if Lira = 1000000;
        output:
        1000000 is equal to 160969.70 USQ
         */

        double lira1 = 1000;
        double lira2 = 1000000;

        double usd2 = 160969.70;

        double usd1 = 160.97;

       // double rate = lira/usd;

        System.out.println(lira1+" "+"liras is equal to"+" "+usd1+" "+"USD");
        System.out.println(lira2+" "+"liras is equal to"+" "+usd2+" "+"USD");

        System.out.println("================================================================");

        /*
        task 06:
        create a class called Circle, and write a program that can calculate the areas and perimeters of the circle based on the value of the radius, and print the result
                Note: assume that pi is equal to 3.14, and you only need to radius in order to calculate the area and perimeter, and print the result
         */
        double radius = 12;
        double pi = 3.14;
        double per= (2*pi)*radius;
        double area = pi*(radius*radius);

        System.out.println("Perimeter is: "+per+ "\nArea is: "+area);

        System.out.println("==================================================================================");


        /*
         task 07:
        create a class called Sequare, and write a program that can calculate the areas and perimeters of the sequare based on the length of the sequare, and print the result
                Note: you only need to length of the sequare in order to calculate the area and perimeter  */


        double length = 10;
         double sqarea = length * length;

        System.out.println("square is: "+sqarea);

        System.out.println("=============================================================================================");

      /* Task 08:
		Create a class called salary calculator, write a program that can calculate the taxt, and salary after tax based on the hourly rate & tax rates
			ex:
				if:
					rate = 55;
					stateTax = 0.04;
					federalTax =0.22;
					weeklyHours = 40;
				then output will be:
					your salary is: 105600 USD
					your total tax is: 27456 USD
					your income after tax is: 78144 USD
				if:
					rate = 45.25;
					stateTax =0.045;
					federalTax = 0.25;
					weeklyHours = 45;
				then output will be:
					your salary is: 91260 USD
					your total tax is: 26921.7
					your income after tax: 64338.3 USD */



        double HourlyRate=55;
        double stateTaxRate=0.04;
        double federalTaxRate=0.22;
        byte weeklyHours=40;
        byte totalWeeks=52;

        double salary=HourlyRate * weeklyHours*totalWeeks;


        double stateTax=salary*stateTaxRate;


        double federalTax=salary*federalTaxRate;



        double totalTax= stateTax +federalTax;


        double salaryAfterTax=salary-(stateTax+federalTax);

        System.out.println("Your salary is: $ "+salary );
        System.out.println("State tax is: $"+stateTax);

        System.out.println("Federal Tax is: $ "+ federalTax);

        System.out.println("Total tax is: $"+ ( federalTax+ stateTax) );


        System.out.println("Salary After Tax is: $"+ salaryAfterTax);






    }
}
