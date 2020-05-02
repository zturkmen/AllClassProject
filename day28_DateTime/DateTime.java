package day28_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {

        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);                   // herseyi yazdiriyor date and time


        //2020-03-20   11:25:30

        LocalDate date=LocalDate.of(2020,3,20);
        LocalTime time=LocalTime.of(11,25,30);
        LocalDateTime dateTime=LocalDateTime.of(date,time);
        System.out.println(dateTime);

        LocalDateTime dateTime2= LocalDateTime.of(2020,3,20,11,25,30);
        System.out.println(dateTime2);    // her ikisi soutta ayni sonucu veriyor sadece birinde hersey acik yaziliyor digerinde sadece variable isimleri


        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MM/dd/yyyy");    //3/20/2019
        LocalDate date2=LocalDate.of(2019,3,20);
        System.out.println(date2.format(dtf));

    }
}
