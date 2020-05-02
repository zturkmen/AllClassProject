package day27_DateTime;

import java.time.LocalDate;

public class Dates {
    public static void main(String[] args) {

        LocalDate date1=LocalDate.of(2020,10,25);
        System.out.println(date1);

        LocalDate birthday=LocalDate.of(1986,03,20);
        System.out.println(birthday);

        //isAfter(date2)
        boolean result1=date1.isAfter(birthday);           // tarih birtdaydan sonra geliyor yani daha buyuk
        System.out.println(result1);

         //isBefore(date1)
        boolean result2=date1.isBefore(birthday);           // tarihler buyuk ve kucuk olarak algiliyor
        System.out.println(result2);

        //isEqual(date1)
        boolean result3=date1.isEqual(birthday);
        System.out.println(result3);

        //isLeapyear();
        boolean result4=birthday.isLeapYear();
        System.out.println(result4);
        System.out.println("===========================================================");

        LocalDate now=LocalDate.now();
        System.out.println("Today is: "+now);




        String str=now.toString();            // sadece now yazsaydim olmuyordu
        System.out.println(str);
        System.out.println(str.replace("-"," "));




    }
}
