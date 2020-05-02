package day14_StringClass;

public class WebAddress {
    public static void main(String[] args) {
        /* write a program that can validate if a web address is valid

        valid web address:
           must start with www.
            must ends with .com.or .edu, or .net or .gov
                           .Com     >Edu     .Net    .Gov

         */
        String website="WWW.cybertek.Gov";

        website= website.toLowerCase();

        boolean validEnding=website.endsWith(".com") || website.endsWith(".edu")||website.endsWith(".gov");


        if(website.startsWith("www.") && validEnding){

            System.out.println("valid address");

        }else{
            System.out.println("invalid adress");
        }




    }
}
