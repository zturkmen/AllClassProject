package day18_NestedLoop;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        /*
        1. write a program that can divide two numbers.
			NOTE: DO NOT USE division, multiplication, or module operators

         */
        int a=10;
        int b=3;

        int count=0;  // count the execution of the loop

        while(a>=b){
            a-=b;
            count++;

        }
        System.out.println(count);

        /*
        While loop is used in situations where we do not know how many times loop needs
        to be excuted beforehand. For loop is used where we already know about the number of times loop needs to be excuted.
         */










    }


}
