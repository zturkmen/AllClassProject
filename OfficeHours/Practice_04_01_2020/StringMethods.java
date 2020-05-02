package OfficeHours.Practice_04_01_2020;

import javax.print.DocFlavor;

public class StringMethods {
    public static void main(String[] args) {

        String s="Reverse Test1";
        StringBuilder str=new StringBuilder();
        str.append(s);
        str=str.reverse();
        System.out.println(str);

        String s1="Reverse Test2";
        char [] chars=s1.toCharArray();
        for(int i=chars.length-1; i>=0; i--){
            System.out.print(chars[i]);
        }
        }


    }

