package day06_Shorthnd;

public class SingleIfStatement {
    public static void main(String[] args) {
        boolean coldWater = true;
        if(coldWater){
            // true
            System.out.println("wear your hat");
            System.out.println("Wear your jacket");
        }

        boolean coronaDetected = true;
        if(coronaDetected) {
            System.out.println("Buy more toilet papers");
            System.out.println("Buy more water");
            System.out.println("Stay at home");
            System.out.println("Do more java coding");
        }
        System.out.println("=====================================================================");

        int a =100;
        boolean evenNumber = a % 2 == 0;   //if a number can be devided by 2 without the reminad
        boolean oddNumber = a % 2!= 0;  // if the number cannot be divided by 2 evenly


        if (evenNumber) {
            System.out.println(a + " is even number" );
        }
        if (oddNumber) {
            System.out.println(a + " is odd number");
        }


    }
}
