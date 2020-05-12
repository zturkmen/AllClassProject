package day37_Constructors;

public class CarObjects {
    public static void main(String[] args) {



        Car car1=new Car("Honda","Accord",2020,22500);
        Car car2=new Car("Ford","Explorer",2020,36000);
        System.out.println(car1);
        System.out.println(car2);


        System.out.println(car1.brand);
        System.out.println(car2.brand);

        System.out.println(car1.model);
        System.out.println(car2.model);


        System.out.println(car1.year);
        System.out.println(car2.year);

        System.out.println(car1.price);
        System.out.println(car2.price);
    }
}
