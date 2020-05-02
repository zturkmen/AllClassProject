package day28_DateTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time_Formattin {
    public static void main(String[] args) {

        LocalTime timer1= LocalTime.of(16,30);    // second da yazabilirisn calisiyor
        System.out.println(timer1);                    //16:30

         // ayni saati am yada pm olarak almak istiyorum
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("hh:mm a");   // saat dakika ve am or pm
        System.out.println(timer1.format(dtf));    // sadece a koyman pm yada am ikisinide saate gore veriyor


        LocalTime timer2=LocalTime.of(10,0);    // eger 24 yazarsan kabul etmiyor hata veriyor 0-23 arasi olamsi gerekiyor saatin.
        System.out.println(timer2);   //10:00                       // eger 12:00 am istiyorsan sadece o yazacaksin hour yerine
        System.out.println(timer2.format(dtf));  //10:00 am
// eger 12 pm istiyorsan hour a 12 yazacaksin



        boolean result1= timer1.isAfter(timer2);
        System.out.println(result1);       // true cunku 16:30   - 10: 00 dan sonra geliyor







    }
}
