package day10_Switch_Scanner;

public class days {
    public static void main(String[] args) {

/*
2. write a program that can display the days based on the numbers 1 ~ 7
     nested if
 */
       int num = 3;
       String result= " ";

       if(num>1 && num<8) {

       if(num==1) {
           result = "Monday";

       }    else if(num==2){
           result = "Tuesday";
       }else if(num==3){
           result ="Wednesday";
       }else if(num==4){
           result= "thursday";
       }else if(num==5){
           result= "Friday";
       }else if(num==6){
           result= "saturday";
       }else if(num==7){
           result= "sunday";
       }

       }else{
           result = "incalid";

       }




       String result2 = " ";

       result2 = (num==1) ? "Monday": (num==2) ? "Tuesday" : (num==3) ? "Wednesday" : (num==4) ? "thursday" :
               (num==5) ? "friday" : (num==6) ? "saturday" : (num==7) ? "sunday" : "invalid";


        System.out.println(result); // nested if
       System.out.println(result2); // ternanry if






            // 3. result to solve

        String result3="";

        if(num>1 && num<8) {
            result3 = (num==1) ? "Monday": (num==2) ? "Tuesday" : (num==3) ? "Wednesday" : (num==4) ? "thursday" :
                    (num==5) ? "friday" : (num==6) ? "saturday" : "sunday";
        }else{
            result3 = "Invalid";
        }







    }
}
