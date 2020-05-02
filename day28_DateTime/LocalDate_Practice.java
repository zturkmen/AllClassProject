package day28_DateTime;

import java.time.LocalDate;

public class LocalDate_Practice {
    /*
    Warmup task:
	1. create an array of string, store five of your friends names in it
	2. create Array of localdates and store thier birthdays in the same order
	3. use for loop to print out your friends' names and thier birthdays
     */
    public static void main(String[] args) {

       String[] friends={"Zeynep", "Nedime","Oznur"};

        LocalDate ZeynepBirthday= LocalDate.of(2020,3,5);
        LocalDate NedimeBirthday= LocalDate.of(1996,5,2);
        LocalDate OznurBirthday=LocalDate.of(1986,4,7);

        LocalDate[] birthdays={ZeynepBirthday,NedimeBirthday,OznurBirthday};   // it has to be match with datatype(localdate)


   // tek for loop kullandik cunku ikisininde indexnum ayni ve ikisinide saymis oldu.
        for(int i=0; i<friends.length;i++){          // we cant use each loop  cunku ikisinin datetype ayni olmasi lazim biri string digeri localdate
            String names=friends[i];
            LocalDate bd=birthdays[i];    // int kullanamayiz cunku localdate datatype
            System.out.println(names+"'s birthday is "+bd);

        }



        int a=100;       // this is just example how to create array
        int b=200;
        int c=300;
        int[] array1={a,b,c};









    }

}
