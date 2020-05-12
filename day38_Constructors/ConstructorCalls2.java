package day38_Constructors;

public class ConstructorCalls2 {

    public ConstructorCalls2(){                          // default constructor

        System.out.println("Default constructor");

    }


    public ConstructorCalls2(int a){
        this();              // eger icinde herhangi birsey yoksa cagirdigin default constructor oluyor

        System.out.println("Constructor with int argument");

    }

    public ConstructorCalls2(String str){
       this(10);            //suanda defaulttan degil bir sonraki int olandan cagiriyor

        // eger bu this ustte olmazsa souttan sonra olursa compiler error veriyor


        // bir yere sadece 1 tane constroctur cagirabiliyorsun
      //  this();    bir kez daha yazamiyorsun buraya rule

        System.out.println("Constructor with String argument");

    }

    public static void main(String[] args) {
      //  ConstructorCalls2 obj=new ConstructorCalls2();       // object using just default constructor ici bos

      //  ConstructorCalls2 ob2=new ConstructorCalls2(10);    // icindeki parameter gore yazdiriyor ona uygun method constructordan cagiriyor

        ConstructorCalls2 obj3=new ConstructorCalls2("Hello");


        // bunlar acik oldugunda asagida tek tek run edilenleri gorebiliyorsun
    }

    public void method1(){
     //   ConstructorCalls2();   error verir cunku cagiramzsin  sadece other constroctura cagirabilirsin

    }







}
