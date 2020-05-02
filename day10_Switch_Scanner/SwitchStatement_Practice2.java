package day10_Switch_Scanner;

public class SwitchStatement_Practice2 {
    public static void main(String[] args) {

        int num =0;

        switch(2){
            case 1 :
                num += 3;

            case 2 :
                num += 2;
                break;

            case 3 :
                num += 10;

            default :
                num -= 5 ;
                break ;

        }
        System.out.println(num);


        char variable = 'F';

            switch(variable) {
                case 'A':
                    // result = "A"; //    this is other way to solve result is the same (variable)
                    System.out.println("A");
                    break;
                case 'B':
                    System.out.println("B");
                    break;

                case 'C':
                    System.out.println("C");
                case 'D':
                    System.out.println("D");
                    break;
                case 'E':
                    System.out.println("E");
                    break;
                default: {
                    System.out.println("not found");


                }

            }



    }
}
