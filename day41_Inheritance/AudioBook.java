package day41_Inheritance;

public class AudioBook extends Book{

    /*
title  (inherited)    in book classda
author (inherited)
price (inherited)

length  declared
listen()
toString()
 */

    public String length;



    public void listen(){
        System.out.println("Listening "+title);
    }



}
