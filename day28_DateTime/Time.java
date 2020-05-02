package day28_DateTime;

import java.time.LocalTime;

public class Time {
    public static void main(String[] args) {

        LocalTime time1= LocalTime.now();
        System.out.println(time1);                   // suanki tamami veriyor


        LocalTime time2= LocalTime.of(15,30,45);     // if minutes 90 yazarsan hata veriyor yada saati 25 yazarsan yada second 75 yazarsan saat kuraliyla isliyor
        System.out.println(time2);









    }
}
