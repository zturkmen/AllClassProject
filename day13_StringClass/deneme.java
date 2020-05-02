package day13_StringClass;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        /*
        Assignment:
            write me a program that asks the user first and last names, then prints the initials.
            ex: input:
                    cybertek
                    school
                output:
                    CS
         */
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your first name");

        String firstName= input.next();
        String firstName1=firstName.substring(0,1).toUpperCase();

        System.out.println("Enter your last name");

        String lastName=input.next();
        String lastName1=lastName.substring(0,1).toUpperCase();

        System.out.println(firstName1+lastName1); //CS

        System.out.println("Enter your full name");
        input.nextLine();
        String fullName=input.nextLine();

        // full name= cybertek school
        String fName=fullName.substring(0,1).toUpperCase();
        String lName=fullName.substring(fullName.indexOf(" ")+1,fullName.indexOf(" ")+2).toUpperCase();
        System.out.println(fName+lName);



















    }
}
