package day36_SttaicBlock;

import day34_CustomClass.Tester;
import org.w3c.dom.ls.LSOutput;

public class StaticBlock4 {


    static String name;
    static Tester tester1=new Tester();


    // gets executed as soon as the class i sloaded Done
    // designed to initialize static variables

    int insVariable;     // static block sadece static variable cagirabiliyor bunu staticde kullanamiyorum
    // eger yapmak istiyorsam object e cevirmem lazim asagidaki gibi


    static{


             name="Cybertek School";
             tester1.setTesterInfo("Muhtar",1254,"SDET",120000);
             tester1.setTesterInfo("Namik",1254,"SDET",120000);

          //   insVariable   bu variable dogrudan cagiramiyorum

        StaticBlock4 obj=new StaticBlock4();    // bununla objec te cevirmis oldum bu sekilde kullanabiliyorum
          obj.insVariable=300;

    }

    public static void main(String[] args) {      //  bu static block yoksa yazdirmiyor null veriyor
       System.out.println(name);

        System.out.println(tester1);   // namik olani verecek cikti

        StaticBlock4 obj2=new StaticBlock4();

      //   obj2.insVariable= 300; // bunu yaparsam sonuc olarak altta 300 alabilirim

        System.out.println(obj2.insVariable);    // 0 veriyor cunku herhangi birsey tanimlamadim

    }
  // static block cikti vermiyor ama main methodla yazdirisan bir defa cikti veriyor ama static block icinde yazani veriyor







}
