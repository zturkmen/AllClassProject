package day07_IfStatements;

public class If_Else_Statements {
    public static void main(String[] args) {
        int number = 0;
        if(number >= 0){
            System.out.println(number+" is positive");
        }
        if(number < 0){
            System.out.println(number+ " is negative");
        }
        if(number >=0){
            System.out.println(number + " is positive");
        } else {
            System.out.println(number + " is negative");
        }
        System.out.println(("================================================"));

        int number1= 100;
        /*
        if(number %2 ==0){
            System.out.println(number1 + " is even number");
        }
        if(number % 2 !=0){
            System.out.println(number1 + " is odd number");
        } */
        if(number1 %2==0){
            System.out.println(number1 + " is even number");
        } else{   //otherwise
            System.out.println(number1+ " is odd number");
        }




    }

}
