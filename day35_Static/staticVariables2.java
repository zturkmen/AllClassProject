package day35_Static;

public class staticVariables2 {


    int insVariable;   // every single object of the class has its own copy

    static int staticVariable;    // there is only one copy of static shared by all objects

    public static void main(String[] args) {

        staticVariables2 obj1=new staticVariables2();
        obj1.insVariable=300;
        obj1.staticVariable=400;



        staticVariables2 obj2= new staticVariables2();

        System.out.println(obj1.insVariable);
        System.out.println(obj2.insVariable);

        System.out.println(obj1.staticVariable);
        System.out.println(obj2.staticVariable);

        // instan variable de oncekine tanimliyorsun cikti deger cikiyor ama digerinde yoksa deger yzdirdiginda 0 cikiyor cunku hepsi own sahip
        // static variablede ilkine tanimliyorsun cikti deger oburune tanimlamasanda digeride ayni degeri veriyor


        System.out.println(staticVariables2.staticVariable);   // static can be called throug class name //400


     //   System.out.println(staticVariable.insVariable);  instance can not be called through class name. compiler error veriyor


        // I can call my instance variable through the object only because it belongs to the object but I can NOT call
        // instance variable through the class name because it does not belong to class

    }


}
