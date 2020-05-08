package day33_CustomClass;

public class carObjects {
    public static void main(String[] args) {

        //String car1=new Car();    //error because it s coming from car object

      /*  Car car1=new Car();
        System.out.println(car1.Brand);  henuz bisey dtanimlamadim //null output

       */
      //  System.out.println(Brand); not work
        Car car1=new Car();
        car1.Brand="BMW";
        car1.model="X5";
        car1.year=2020;
        car1.color="Red";
        System.out.println(car1.Brand);   // instance variables are object variables, we can call them throught the oblect name

        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.color);
        System.out.println("======================================================");
// instance variable calls object variables
        // if there is no new variable asagidakiler default value olacak

        car1.start();           // it is coming from bir onceki class  (car class)
        car1.drive();


        System.out.println("=============================================");

        Car car2=new Car();
        car2.Brand="Toyota";
        car2.model="Corolla";
        car2.year=2020;
        car2.color="White";

        System.out.println(car2.Brand);
        System.out.println(car2.model);
        System.out.println(car2.year);
        System.out.println(car2.color);

        car2.start();
        car2.drive();
        car2.getCarInfo();

        System.out.println("========================================");

        Car car3=new Car();
        car3.Brand="Mercedes";
        car3.model="C class";
        car3.year=2020;
        car3.color="White";

        car3.start();   // bunu oncesine koyamazsin cunku henuz tanimlanmamis
        car3.drive();
        car3.getCarInfo();

        System.out.println("=======================================");
        String str ="A";
        String str2 = "B";
        String [] arr={str,str2};

        Car[] cars={car1,car2,car3};
        cars[0].getCarInfo();
        cars[1].getCarInfo();
        cars[2].getCarInfo();



    }
}
