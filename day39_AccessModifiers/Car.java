package day39_AccessModifiers;

public class Car {
    /*
    Warmup tasks:
    1. create a class called Car:
                instance variable:
                        brand, model, year, price
                add a constructor that can initialize brand of car
                add a constructor that can initialize brand and model of the car
                                (apply constructor call to initalize the brand)
                add a constructor that can initialize the brand, model, year of the car
                                (apply constructor call to initialize brand, model)
                add a constructor that can initialize brand, model, year and price of the car
                                (apply constructor call to initialize brand, model, year)
                add toString method

     */

    String brand;
    String model;              // default value                     // cunku henuz initialize olmadi
    int year;                  // default value
    double price;            // default value

    public Car(String brand){                   // constructor
        this.brand=brand;

    }

    public Car(String brand,String model){
        this(brand);          // bu ve this.brand=brand; ayni sonucu veriyor ikisinide kullanabilirsin
     //   this.brand=brand;
        this.model=model;

    }

    public Car(String brand,String model,int year){
        this(brand,model);    // this.brand=brand;  ve this.model=model;  same with this
        this.year=year;

    }


    public Car(String brand,String model,int year,double price){
        this(brand,model,year);          // eger buraya price da yazarsan kendisiyle cagirilamiyor kuralini bozarsin error verir
       // this(brand);   bunu yapamazsin birden fazla cagiramazsin const.
        this.price=price;
    }


    public String toString(){
        return "year "+year+" brand: "+brand+" model "+model+" price: "+price;
    }







}
