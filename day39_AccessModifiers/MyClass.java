package day39_AccessModifiers;

public class MyClass {
    int x;

    public MyClass(int y) {
        x = y;
    }

    public static void main(String[] args) {
        MyClass myObj = new MyClass(5);
        System.out.println(myObj.x);
    }
}


class Carr{

    int modelYear;
    String modelName;

     Carr(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        Carr myCar = new Carr(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}

class Deneme{

    public Deneme(){
        System.out.println("Constructor");          // 2.
    }

    public static void main(String[] args) {           // 3. eger object create souttan onceyse

        System.out.println("Main method");
        Deneme obj=new Deneme();
     //  System.out.println("Main method");     // eger bu tanimlanan object creat ettikten sonra yaziliyorsa sirayla
        //  aliyor ama obj createden once ise once main method u sonra constructor i yazdiriyor

        // eger object create etmen birden fazlaysa o kadar run ediyor.
    }
    static{
        System.out.println("Static block");     //1.
    }
}