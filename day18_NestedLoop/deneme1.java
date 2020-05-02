package day18_NestedLoop;

import java.util.Scanner;

public class deneme1 {
    public static void main(String[] args) {
        double premium = 0;
        int accidentsAmount = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;
        String vehicleOwnership = "";
        String vehicleUsage = "";
        String continuousInsurance = "";
        String education = "";
        String name = "";
        String referenceNumber = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the CountyFarm car insurance!");

        System.out.println("Enter your name");
        name+=input.nextLine();

        System.out.println("Do you have a US driver license?");
        String driverl=input.next();
        if(driverl.equalsIgnoreCase("No")){
            System.out.println("Invalid data!");
            System.exit(0);


        }else{
            premium+=0;
        }

        String zipcode;
        System.out.println("Enter your zip code");
        zipcode=input.next();

        if(zipcode.equals("20910") || zipcode.equals("20740")){
            premium+=60.0;
        }else if(zipcode.equals("22102") || zipcode.equals("22103")){
            premium+=30.0;
        }else{
            premium+=50.0;
        }


        System.out.println("Is this vehicle Owned, Financed, or Leased?");
        vehicleOwnership=input.next();
        if(vehicleOwnership.equalsIgnoreCase("owned")){
            premium+=10.0;
        }else{
            premium+=20.0;
        }


        System.out.println("How is this vehicle primarily used?");
        vehicleUsage=input.next();
        if(vehicleUsage.equalsIgnoreCase("business")){
            premium+=50.0;
        }else if(vehicleUsage.equalsIgnoreCase("pleasure")){
            premium+=10.0;
        }else if(vehicleUsage.equalsIgnoreCase("commute")){
            premium += 20.0;


            System.out.println("Days Driven To Work And/Or School");
            daysDrivenToWorkOrSchool = input.nextInt();
            premium += daysDrivenToWorkOrSchool * 5;

            System.out.println("Miles Driven To Work And/Or School");
            milesToWorkOrSchool = input.nextInt();
            premium += milesToWorkOrSchool * 1;
        }

        System.out.println("How old are you?");
        int age=input.nextInt();
        if(age<16){
            System.out.println("Invalid data!");
            System.exit(0);

        }else if(age>16 && age<18){
            premium*=20.0;
        }else if(age>=18 && age<=21){
            premium*=6.0;
        }else if(age>21 && age<25){
            premium*=2;
        }else{
            premium+=0;
        }


        System.out.println("How many years do you have driving experience?");
        int experience=input.nextInt();
        if (!(experience>0 || age - experience > 16)) {
            System.out.println("Invalid data!");
            System.exit(0);
        }else if((age - experience) >= 16) {
            premium -= (experience * 5);
        }


        System.out.println("Have you had any accidents in the last 5 years?");
        String answer=input.next();
        if(answer.equalsIgnoreCase("yes")){
            System.out.println("How many?");
            accidentsAmount=input.nextInt();
            premium+=accidentsAmount*(premium*20/100);
        }else{
            premium+=0;
        }


        System.out.println("Have you had continuous insurance for the past 12 months?");
        String answer2=input.next();
        if(answer2.equalsIgnoreCase("No")){
            premium+=premium*2;
        }else{
            premium+=0;
        }
         input.nextLine();

        System.out.println("What is the highest level of education you have completed?");
        education=input.next();
        if(education.equalsIgnoreCase("phd") || education.equalsIgnoreCase("bachelors") ||
                education.equalsIgnoreCase("masters")){
            premium+=premium-(premium*5/100);
        }else if(education.equalsIgnoreCase("Doctors")){
            premium+=premium-(premium*10/100);
        }else{

            premium+=premium+(premium*5/100);
        }


        System.out.println(name+", here's your quote! ");
        System.out.println("Start Your Policy Today For: $"+premium);
        String reference=name.substring(0,2).toUpperCase()+age+name.substring(name.length() - 2).
                toUpperCase() +zipcode+education.toUpperCase().replace(" ","");
                System.out.println("Reference number: "+ reference    );






















































    }
}
