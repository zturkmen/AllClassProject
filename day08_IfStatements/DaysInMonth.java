package day08_IfStatements;

public class DaysInMonth {
    public static void main(String[] args) {
        /*2. write a program that can find the number of days in a month
	 	(Assume that Feb has 28 days)
	 		byte month =  3
			28 days: 2
			30 days: 4,6,9,11
			31 days: 1,3,5,7,8,10,12*/


        byte month = 3;

        boolean days28 = month == 2;
        boolean days30 = month == 4 || month ==6 || month == 9 ||month ==11;
        boolean days31 = days28 == false && days30 ==false;  //    = !days28 %% !days30;    bunuda kullanabilirsin

        if(days28){
            System.out.println("it has 28 days");
        }
        if(days30){
            System.out.println("it has 30 days");
        }
        if(days31){
            System.out.println("it has 31 days");
        }








    }
}
