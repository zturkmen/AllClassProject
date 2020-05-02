package day14_StringClass;

import java.util.Scanner;

public class credintials {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter your username");
        String inputUsername=input.next();

        System.out.println("Enter your password");
        String inputPassword=input.next();


        String validUserName="cybertek";
        String validPassword="cybertekschool";

        if(inputUsername.equals(validUserName) && inputPassword.equals(validPassword)){
            System.out.println("Log in successfully");
        }else{
            System.out.println("invalid credentials");
        }







    }
}
