package day15_ForLoop;

import java.util.Scanner;

public class deneme2 {
    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        String first=email.substring(0,email.indexOf("_"));
        String last=email.substring(email.indexOf("_")+1,email.indexOf("@"));
        String domain=email.substring(10);

        String reverse=last+"_".contains(first)+domain;

        if(email.contains("_")){
            System.out.println(reverse);
        }else{
            System.out.println("not found");
        }








    }
}
