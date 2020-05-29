package OfficeHours.Practice_05_27_2020;

public class methodOverriding {


    public void method1(){
        System.out.println("Super class");

    }


}

class Test extends methodOverriding{                         // eger baska bir class aciyorsna default olmak zorunda access modifier

   @Override
    public void method1(){

        System.out.println("Sub class");
    }

    public static void main(String[] args) {
        methodOverriding obj=new methodOverriding();    // method ismi ayni ama obj class ismiyle create ettigin icin
        obj.method1();   // bu super classdan geliyor o yuzden ordakini yazdircak yani obj methodoverriding classdan create edildi

    }

}
