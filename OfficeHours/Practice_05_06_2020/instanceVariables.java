package OfficeHours.Practice_05_06_2020;

public class instanceVariables {

    int a=100;     // instance variable: belongs to the object

    public static void main(String[] args) {
        int a=100;  // local variable
           instanceVariables obj1=new instanceVariables();     // object create ettik
        obj1.a=300;
        System.out.println(300);    // 300 object



        instanceVariables obj2=new instanceVariables();
        System.out.println(obj2.a);    //100




    }



}
