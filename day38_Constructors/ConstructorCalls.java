package day38_Constructors;

import java.lang.reflect.Constructor;

public class ConstructorCalls {

    public ConstructorCalls(){                 // constroctur diger methoddakileri cagirabiliyor ama digerleri onu cagiramiyor
        method1();
        method2();

    }

    public ConstructorCalls(int a){     // you can not call constructor with name just you can call with this. keyword
        // this(): used for calling constructor

      //  ConstructorCalls();     you cant call
        this();          // cagirmak istiyorsan bununla cagirabilirsin


    }

    public static void method1(){
      //  method2();                    bunu cagiramazsin
     //   ConstructorCalls();              bunu cagiramazsin

    }

    public void method2(){

    }









}
