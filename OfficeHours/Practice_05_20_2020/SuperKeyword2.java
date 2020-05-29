package OfficeHours.Practice_05_20_2020;


class TestData{
    int num=100;
    String name="Cybertek";



public void method(){
    System.out.println("Cybertek School");
}

}


public class SuperKeyword2 extends TestData {

    int num = 200;
    String name = "MIT";


    public void method() {
        System.out.println("MIT School");
    }

    public SuperKeyword2(){
       method();  //MIT School
        super.method(); //Cybertek School
        System.out.println(this.num);// 200  sadece num da diyebiliorsin sub classdakini yani methoddakini cagiriyor
        System.out.println(super.num); //100  cuperclassdaki variable cagirmak icin
        System.out.println(super.name);  //Cybertek
    }

    public static void main(String[] args) {
        SuperKeyword2 obj=new SuperKeyword2();
    }
}