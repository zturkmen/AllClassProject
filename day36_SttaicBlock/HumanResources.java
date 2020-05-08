package day36_SttaicBlock;

import OfficeHours.Practice_05_06_2020.Developer;

public class HumanResources {

   static Developer dev1= new Developer();
   static Developer dev2= new Developer();
   static Developer dev3= new Developer();
   static Developer dev4= new Developer();
   static Developer dev5= new Developer();


 /*   public static void main(String[] args) {    // bunu yazdirdiginda cikti vermiyor capitalone classda
        dev1.setInfo("Namik","Develeoper",120000,14515);
    }
*/

    static{              // bunu yazidirsam eger capitalonede cikti veriyor

        dev1.setInfo("Namik","Develeoper",120000,14515);
    }






}
