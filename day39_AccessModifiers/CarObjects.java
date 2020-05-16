package day39_AccessModifiers;

public class CarObjects {

    public static void main(String[] args) {

        // new Constructor    // object create etmek icin

        Car car1=new Car("Toyota");
        System.out.println(car1);             // hascode veriyor toString olmadigi zaman henuz
        // tostring eklenince sonuc sadece brand yapildigi icin digerlerini 0 veriyor

        Car car2=new Car("BMW","X6");
        System.out.println(car2);

        Car car3=new Car("Lexus","RX",2020);
        System.out.println(car3);

        Car car4=new Car("Lexus","RX",2020,25000);
        System.out.println(car4);




    }
}
