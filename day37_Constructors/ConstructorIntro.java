package day37_Constructors;

public class ConstructorIntro {

    //public method() {} // constructor name must be same with class name

    public ConstructorIntro(int a){      // constructor method     // sadeec 1 const var suanda with parameter int

        System.out.println("Constructor with parameter of int");    // eger object create ettiysem bu run ediyor
        // asagida object create ettim ve kac tane ettiysem object create o kadar yazdiriyor
    }

    public static void main(String[] args) {                                                // mevcut constructor
      //  ConstructorIntro obj=new ConstructorIntro();       // object must be created with existing constructor

       ConstructorIntro obj2=new ConstructorIntro(10);    // 10 is int a dan geliyor
      //  ConstructorIntro obj3=new ConstructorIntro(10);  eger bunuda eklersem yukardaki sout 2 defa yaziriacak o zaman cunku 2 tane object  cretae ettim

        // 2 tane constructor method var biri with paremete other is without parameter eger with para,eter
        // yapacaksam () icine deger vermeliyim diger turlu bos birakmaliyim compire etmesi icin

    }
}
