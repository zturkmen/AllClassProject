package day23_methods;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class calisma {

        /*
        warm up tasks:
	1. write a method called KmToMiles that can convert km to miles
	 				1 km = 0.612 miles
	2. write a method called GalonsToLitters, that can convert gallons to litters
	 			   1 G = 3.75 L
	3. write a method called Calculation, that can accepts 3 parameters: 2 numbers and one operator, and prints out the calculation
		if operator is not between [-, +, *, /, %] output should be Invalid Operator
		Ex: calculate(10, 2, "*") ==> 20;
	4. write a method called Grade, that can print out the grade based on the score of the student
			if score is 100 ~ 90 ==> A
			if score is 89 ~ 80 ==> B
			if score is 79 ~ 70 ==> C
			if score is 69 ~ 60 ==> D
			if score is 0 ~ 59 ==> F
			otherwise ==> Invalid Score
		Ex:
			Grade(100); ==> A
			Grade(120); ==> Invalid
         */


    public static void main(String[] args) {


        kmtomiles(5);
        gallonstolitters(4);
        calculation(10,20,"-");
        grade(120);



    }

    public static void kmtomiles(int km) {
        double kmtomiles = (km * 0.612);
        System.out.println(kmtomiles);

    }

    public static void gallonstolitters(int gallons) {

        double gallonstolitters = (gallons * 3.75);
        System.out.println(gallonstolitters);

    }

    public static void calculation(int num1, int num2,String operator){
        if(operator.equals("+")){
            System.out.println(num1 + num2);
        }else if(operator.equals("*")){
            System.out.println(num1 * num2);
        }else if(operator.equals("-")){
            System.out.println(num1 - num2);
        }else if(operator.equals("/")){
            System.out.println(num1 /num2);
        }else if(operator.equals("%")){
            System.out.println(num1 % num2);
        }else{
            System.out.println("Invalid operator");
        }
    }
    public static void grade(int score ){
        char grade = (score >= 90 && score <=100) ? 'A'
                    : (score >=80 && score <=89) ? 'B'
                    : (score >=70 && score <=79) ? 'C'
                    : (score >=60 && score <=69) ? 'D'
                    : (score >=0 && score <=59) ? 'F' : 'G';
        if(grade == 'G'){
            System.out.println("Invalid Score");
        }else{
            System.out.println(grade);
        }

    }


}
