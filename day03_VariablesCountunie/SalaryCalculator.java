package day03_VariablesCountunie;

public class SalaryCalculator {
    public static void main(String[] args) {

        double HourlyRate=55;
        double stateTaxRate=0.04;
        double federalTaxRate=0.22;
        byte weeklyHours=40;
        byte totalWeeks=52;

        // salary= hourlyRate*weeklyHours*52



        double salary=HourlyRate * weeklyHours*totalWeeks;

        // salary before tax

        //stateTax=salary*stateTaxRate

        double stateTax=salary*stateTaxRate;

        //federalTax=salary*federalTaxRate

        double federalTax=salary*federalTaxRate;

        // totalTax =stateTax +federalTax

        double totalTax= stateTax +federalTax;

        //salaryAfterTax=salary-stateTax-federalTax;

        double salaryAfterTax=salary-(stateTax+federalTax);

        System.out.println("Your salary is: $ "+salary );            //concatenation

        System.out.println("State tax is: $"+stateTax);            //concate

        System.out.println("Federal Tax is: $ "+ federalTax);

        System.out.println("Total tax is: $"+ ( federalTax+ stateTax) );
        //                                   String+stateTax

        System.out.println("Salary After Tax is: $"+ salaryAfterTax);
        /* System.out.println("9" + 3);    //93, concatenation

        System.out.println(9 + "3");     //93, concate

        System.out.println(9+3);    //12, addition*/




    }
}
