package OfficeHours.Practice_05_06_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class DevelopersObject {
    public static void main(String[] args) {


        Developer developer1 = new Developer();
        developer1.setInfo("Leanardo", "Senior Developer", 160000,18121993);

        System.out.println(developer1);

        Developer developer2=new Developer();

        developer2.setInfo("Leon","Senior Developer",180000,12546);


        developer1.coding();
        developer2.coding();

        developer1.fixingBug();
        developer2.fixingBug();

        System.out.println("==============================================");


        Developer [] arr ={developer1,developer2};

       // System.out.println(arr[0]);   sonuc toStrin method veriyor

      //  System.out.println(arr[0].name);  // Leanardo  sadece isim vermesini istiyorsan boyle ayzdiriyorsun


        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);       // butun bilgileri veriyor

           // System.out.println(arr[i].name);   sadece butun isimler icin
        }



        for(Developer each: arr){           // each element
            System.out.println(each);       // butun bilgileri veriyor

         //   System.out.println(each.name+" "+each.salary);    name ve salary yazdiriyorsun
        }


        System.out.println("===============================");

        ArrayList<Developer> developers=new ArrayList<>(Arrays.asList(arr));
       // developers.addAll(Arrays.asList(developer1,developer2));

      //  System.out.println(developers);
      //  System.out.println(developers.size());
/*
        for(int i=0; i<developers.size();i++){
            System.out.println(developers.get(i).name);
        }
*/


     for(Developer each:developers){
        // System.out.println(each);   hepsi
         System.out.println(each.name+" "+each.salary);  // sadece name ve salary
     }



    }

}
