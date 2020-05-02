package day11_Scanner;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

/*
 2. write a program that can calculate the salary after tax
                needed informations:
                                employee' salaray
                                state tax
                                federal tax
 */


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your salary: ");

        int salary = input.nextInt();

        System.out.println("Enter the state tax: ");
        byte stateTax=input.nextByte();
        double stateTaxPercentage = stateTax/100.0;
        System.out.println("Enter federal tax: ");
        byte federalTax = input.nextByte();
        double federalTaxPercentega = federalTax/100.0;
        double totalTax = (federalTaxPercentega + stateTaxPercentage) * salary;

        double salaryAftertax= salary-totalTax;

        System.out.println("Your salary after tax is: $"+ salaryAftertax);


        System.out.println("Total tax: $" +totalTax);  // just example









    }
}
