package day38_Constructors;

public class ConstructorPractice {

    public ConstructorPractice(){
         this(10.0);         // suanda C
        System.out.println("A");
       // this(0.5);      rule 3
    }

    public ConstructorPractice(int a){
        this();             // suanda C A
        // this(10.5);

        System.out.println("B");      // B

    }

    public ConstructorPractice(double a){
       // this();        you cant rule 5

       //this(5.5);   rule 5  you cant

        // this(10); rule 5
        System.out.println("C");

    }


    public static void main(String[] args) {
               new ConstructorPractice(10);
    }

















}
