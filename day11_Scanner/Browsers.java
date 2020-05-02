package day11_Scanner;

public class Browsers {
    public static void main(String[] args) {
        /*
        2. Assume that the valid browsers are: chrome, firefox, opera, safari.
                        3. if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser Name
            Note: Do Not use scanner or if statement or ternary for this task
         */


        String browserName= "Chrome";

        switch (browserName){
            case "chrome":
            case "Chrome":

                System.out.println("Chrome is opening...");
                break;
            case "firefox":
            case "Firefox":

                System.out.println("Firefox is opening...");
                break;

            case "safari":
            case "Safari":

                System.out.println("Safari is opening...");
                break;

            case "opera":
            case "Opera":

                System.out.println("Opera is opening...");
                break;

            default:
                System.out.println("Invalid browser Nam, Please give the right browser name");


        }



    }
}
