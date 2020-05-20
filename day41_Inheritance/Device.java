package day41_Inheritance;
/*
creata a class called device:
				attributes: brand, model, price, country
				methods: toString

 */
public class Device {
    public String brand;
    public String model;
    public double price;
    public String country;

    public String toString() {
        return "Brand: " + brand + ", Model: " + model + ", Price: $" + price + ", Country: " + country;
    }

}
/*
create a class called TV:
				attributes: brand, model, price, country
				methods: watch, toString

 */

class TV extends Device{
    public void watch(){
        System.out.println(brand+" is the best for watching");
    }

    public String toString() {
        return "Brand: " + brand + ", Model: " + model + ", Price: $" + price + ", Country: " + country;
    }

}
/*
create ba class called phone:
				attributes: brand, model, price, country
				methods: call, text,  toString
 */

class Phone extends Device{
    public void call(){
        System.out.println(brand+" is the best for quality");
    }

    public void text(){
        System.out.println(brand+" is the best for quality");
    }

}

class DeviceObject{
    public static void main(String[] args) {
        TV obj1=new TV();
        obj1.brand="Samsung";
        obj1.model="15";
        obj1.price=2000;
        obj1.country="South Korea";
        System.out.println(obj1);

        obj1.watch();

        System.out.println("================================================");
        Phone obj2=new Phone();
        obj2.brand="Apple";
        obj2.model="i10";
        obj2.price=1000;
        obj2.country="U.S";
        System.out.println(obj2);

        obj2.call();
        obj2.text();
    }
}

