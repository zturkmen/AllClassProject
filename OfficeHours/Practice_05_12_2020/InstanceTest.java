package OfficeHours.Practice_05_12_2020;

public class InstanceTest {
    public static void main(String[] args) {

        Instances obj1 = new Instances();            // each object own copy
        obj1.name = "Muhtar";            // buraya muhtar yazinca digeride muhtar olmuyor
        Instances obj2 = new Instances();

        obj2.name = "Kuzzat";


        //  System.out.println(obj1.name);           // muhtar
        // System.out.println(obj2.name);            // null cunku her biri kendi objecgine sahip bu tanimli degil henuz

        // eger tanimlarsam obj2 ye bir isim o o sekilde print olacak


        obj1.printName();                      //     muhtar

        obj2.printName();                       //kuzzat
    }
}
class InstanceBlock{

    public static void main(String[] args) {
        Instances obj=new Instances();
        System.out.println(obj.name);               // zuura    cunku firts bunu yazdiriyor blockdan geliyor, eger block i kapattirsam null yazdiriyor.

    }
}










