package day42_Inheritance.Task2;
/*
create a class called TV:
                attributes: brand, model, price, country, Type
                methods: watch, toString
 */
public class TV extends Device{
  /*
    brand, (Inherited)
    model,  (Inherited)
    price,   (Inherited)
    country,   (Inherited)
    Type  (Inherited)
    watch,
    toString  (Inherited)
     */

    public TV(String brand, String model, double price, String size){

        setDevice(brand,model, price, "TV", size );
    }

    public void wacth(){

        System.out.println("I am watching "+brand+" "+model+" "+type+" that cost me $"+price+" from "+country );

    }

}
