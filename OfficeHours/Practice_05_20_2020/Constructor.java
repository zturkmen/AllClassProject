package OfficeHours.Practice_05_20_2020;


class Test{
    public Test(int a){
        System.out.println("A");
    }

}
public class Constructor extends Test  {
    public Constructor(){
        super(10); // A     // methoddan cagiriyor super() icine yazdigida zaten int var oldugu icin
        System.out.println("B");   // AB

    }

    public static void main(String[] args) {
       Constructor obj = new Constructor();   // object create etmeden run edemiyorsun


    }

}
