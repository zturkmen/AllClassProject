package day38_Constructors;

public class ConstructorCalls3 {

    public ConstructorCalls3(){

        this(9); // int argument

        System.out.println("default");

    }

    public ConstructorCalls3(int a){
      //  this(10);       last rule kendi icinde cagirilamiyor

      //  this();  you cant call default const because you already call
        // yani sen dafult const a ilk once burdan cagirdin ve int arumenti verdin suanda buraya onu cagirdigin zaman
        // aynisini cagirmis oluyorsun tekrar o yuzden error veriyor
        // yani ayni olani bidaha cagiramayacagin icin

        System.out.println("Int argument");
    }

    public ConstructorCalls3(String str){
       // this("Hello");    you cant call ayni olani birinirnden
    }

    public static void main(String[] args) {
     new ConstructorCalls3();      // sadece bununla bile run edeip sonuc aliyorsun
    }


    public void method1(){

      //  this();       // you cant call constructor


    }












}
