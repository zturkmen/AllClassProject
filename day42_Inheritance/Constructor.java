package day42_Inheritance;


class test{            //// superclass cannot extend subclass   buraya class test extends Constructor yazamazsin
    public test(){
        System.out.println("A");

        // eger asagida extends yapmzam aralarinda bir bag olmayacgi icin sadece constructor class printout olacak
    }

}
public class Constructor extends test{   // extends olmzsa sadece constructor class executed olacak
            // sub               super

    public Constructor(){
        System.out.println("B");
    }

    public static void main(String[] args) {
        Constructor obj=new Constructor();  //A B  // object create etmeden constructor class i cagiramiyorsun
        // bunda neden 2 sinide aliyorsun sunuc cunku aralarinda extends var ve usten asagi yazdiriyor
        // constructor extends test



        test obj1=new test();    // sadece  A bunu print eder cunku aralarinda bag yok
        // yani super class not extends subclass  sadece test constructor yazdiriyor

    }


}
