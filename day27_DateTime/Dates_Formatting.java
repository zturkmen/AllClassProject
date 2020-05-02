package day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates_Formatting {
    public static void main(String[] args) {



        LocalDate date1= LocalDate.now();
        System.out.println(date1);


        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd");   // istedigin sekilde cevirebilrisin yil sonra, ay once gibi

        System.out.println(date1.format(dtf));

        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("MM/yyyy/dd");
        System.out.println(date1.format(dtf1));

/*
create a date called birthDay: Month/Days/year
 */

     DateTimeFormatter dtf2=DateTimeFormatter.ofPattern(("EEE MMM/dd/yy"));   // sadece
     LocalDate date2=LocalDate.of(1999,12,25);
     String str1=date2.format(dtf2);
        System.out.println(str1);

        LocalDate date3 =LocalDate.now();

        System.out.println( date3.format(dtf2) );




    }

}
