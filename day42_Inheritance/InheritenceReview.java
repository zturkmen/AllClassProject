package day42_Inheritance;

class B{
    public B(int a){          // constructor methhod
        System.out.println("int");
    }

    public B(double a){
        System.out.println("double"); // constructor methhod
    }

    public B(long a){
     //   this(4.5);  buraya tasiyonca error vermiyor first oldugu icin
      //  this(10);  one constructor only one constructor cagirabiliyor burdakilerin her iksinide kullanamzsin sadece bir tane this() kullanabilirsin
        System.out.println("long"); // constructor methhod
       // super(4.5); has to be parents class
       // this(4.5);  has to be first step


    }
}





public class InheritenceReview extends B {    // superclass must be call constructor
    public InheritenceReview(String a){

       // super(19);     // int ve
        super(19l);   //long
        System.out.println("String");  // string

    }

    public static void main(String[] args) {       // constructor will not be inheritanced
       InheritenceReview obj=new InheritenceReview("Hello");
    }



}
