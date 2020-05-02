package day02_Variablesss;

public class EmplyeeInfo_Variables {
    public static void main(String[] args) {
        /* create a class called EmployeeInfo_Variables:
        print:
        your company's name
        your name
        your EmployeeId
        your JobTitle
        your Salary */



        String employeeName  = "Andrea";
        String companyName =  "Oracle";
        int employeeId = 9;
        String jobTitle = "QA";
        double salary = 100000.5;
        int ssn = 123456789;

        // employee name : Andrea
        System.out.println("Employee Name: "+employeeName);
        System.out.println("Company Name: "+companyName);
        System.out.println("Employee Id: "+employeeId);
        System.out.println("Salary: "+salary);
        System.out.println("Ssn: "+ssn);


        System.out.println("\nEmployee Name: "+employeeName + "\nCompany Name: "+
                companyName + "\nEmployee Id: "+employeeId + "\nSalary: "+
                salary + "\nSsn: "+ssn);


        System.out.println("======================================");

        String firstName = "Zeynep";
        String lastName = "Dere";

        // Full Name: Zeynep Dere
        System.out.println("Full Name: "+firstName +" "+lastName);


    }    }


