package day07_IfStatements;

public class Vote {
    public static void main(String[] args) {

        /*
        5. write a java program that can identify if a person is eligible to vote for Donald Trump
         */
        int age = 18;
        boolean citizien = true;


        boolean eligible = age >= 18 && citizien == true;
        if(eligible==true){
            System.out.println("you are eligible to vote");
        }
        if(eligible != true){
            System.out.println("you are not eligible to vote");
        }
    }
}
