package day41_Inheritance;
import day41_Inheritance.Data;
public class TestData extends Data {
    public static void main(String[] args) {
/*
// sadece impoprt yapip extends yapmadan bu sekilde
        System.out.println(Data.a);
        Data.method1();

      //  System.out.println(TestData.a);    i cant call import yapmama ragmen
      //  TestData.method1():

        */

// buda extends yaptiktan sonraki  tanimlama
        System.out.println(TestData.a);
        TestData.method1();



    }



}
