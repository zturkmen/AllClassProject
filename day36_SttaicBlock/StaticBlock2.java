package day36_SttaicBlock;

import day34_CustomClass.Tester;

public class StaticBlock2 {

    static int a;
    static int b;
    int c;

   /*  if(100>200){                burda kullanamiyorsun
        a=100;
    }else{
        b=200;
    }
    */





    static Tester tester1 = new Tester();

    public static void main(String[] args) {
        tester1.setTesterInfo("Jean", 123, "SDET", 120000);
    }

    static{
        a =100;
        b= 200;
        // c = 300; // static only accepts static
        if(100 > 200){
            a = 100;
        }else{
            b= 200;
        }

    }

    static{
        a=100;
        b=200;
        // c=300; // static only accepts static

        if(100>200){
            a=100;
        }else{
            b=200;
        }

        tester1.setTesterInfo("Jean", 123, "SDET", 120000);
    }










}
