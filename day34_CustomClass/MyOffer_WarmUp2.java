package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffer_WarmUp2 {
    /* create a class called MyOffers
         Create 5 offer objects, and add them into the list of offers, and then:
         1. use for loop to print out the info of each offer
2. write a program that can only retain the offers if:
         1. the offer is for fulltime position
      2. offer is from your local area
      3. salary is greater than 100K
 */
    public static void main(String[] args) {
        Offer offer1=new Offer();
        offer1.setOfferInfo("Chicago","Deloite",120000,true);
        Offer offer2=new Offer();
        offer2.setOfferInfo("Newyork","BankOfAmerica",130000,true);
        Offer offer3=new Offer();
        offer3.setOfferInfo("Texas","Apple",100000,true);
        Offer offer4=new Offer();
        offer4.setOfferInfo("Virgina","Oracle",60000,false);
        Offer offer5=new Offer();
        offer5.setOfferInfo("California","Amazon",110000,true);
        ArrayList<Offer> offers =new ArrayList<>(Arrays.asList(offer1,offer2,offer3,offer4,offer5));
        for(Offer each:offers){
            System.out.println(each);
        }
        System.out.println("======================================");
      //  ArrayList<Offer> fulltime=new ArrayList<>();
        for(Offer each:offers){
            if(each.isFullTime==true){
                System.out.println(each);   // fulltime all offers
            }
        }
        //   offers.removeIf(p->p.isFullTime!=true);
        //   System.out.println(offers);
        System.out.println("==================================");
        ArrayList<Offer> locationss= new ArrayList<>();
        for(Offer each: offers){
            if(each.location=="Chicago"){
                System.out.println(each);
            }
        }
        System.out.println("=====================================================");
        //   offers.removeIf(p->p.salary<=100000);
        // System.out.println(offers);
        ArrayList<Offer> salaryy=new ArrayList<>();
        for(Offer each: offers){
            if(each.salary>=100000){
                System.out.println(each);
            }
        }
        System.out.println("==============================================");
        //  together all condition
        offers.removeIf(p-> !p.location.equals("Chicago") || p.salary<=100000 || !p.isFullTime==true);
        System.out.println(offers);
        // [Company: Deloite location: Chicagosalary: 120000.0isFulltime: true]
    }
}
