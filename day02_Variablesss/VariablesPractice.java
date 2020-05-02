package day02_Variablesss;

public class VariablesPractice {
    public static void main(String[] args) {
        /*
        salary, federaltax statetax, loan,ssn
         */

        int salary = 120000;
        double federalTax = 0.18;
        float stateTax = 0.065f;
        //salary after tax=salary(1-sum of taxes)

        double sumtaxes = federalTax + stateTax;
        double salaryAfterTax = salary * (1-sumtaxes);
        System.out.println(salaryAfterTax);

        System.out.println("===========================");
        // area of the circke = r* r* 3.14;

        double r =5.5;
        double area =r*r* 3.14;
        System.out.println(area);

        System.out.println("=========================");

        int kg =90;
        double pound = kg * 2.25;
        System.out.println(pound);

        System.out.println("==========================");
        double lira = 1000;
        double liraInDollar = lira / 6.15;
        System.out.println(liraInDollar);
        System.out.println("==========================");
        double liter = 10;
        double gallon = liter / 3.785;
        System.out.println(gallon);







    }
}
