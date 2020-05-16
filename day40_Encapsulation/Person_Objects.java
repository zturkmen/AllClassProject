package day40_Encapsulation;

public class Person_Objects {

    public static void main(String[] args) {

    Person Zarina=new Person("Zarina");
        System.out.println(Zarina.name);
       // System.out.println(SSN); i cant because of private data
        // bunun icin set and get yapman lazim sadece oyle access yapabilirsin asil classda person da yapmalisin

        System.out.println("Zarina SSN "+Zarina.getSSN()); // 0 but not valid SSN you need to modify SSN
        // modify etmek icin Person classda yazman lazim always public set and get class oraya yaziliyor.

        Zarina.setSSN(1234);

        System.out.println(Zarina.getSSN());


        //  System.out.println( Zarina.ID );
        Zarina.setID(567);
        System.out.println( "Zarina' ID: "+Zarina.getID());


    }



}
