package day35_Static;

public class staticMethods {
    int a=100;     // not accepts instance method sadece create edersen eger kullanabilirisin

    static int b=200;     // heryerde kullanabilirsin static kullandigin zaman    // global

    public static void main(String[] args) {

        //  System.out.println(a);   // static only accepts static

        staticMethods obj = new staticMethods();

        System.out.println(obj.a);     // sadece a yazdiginda yazmiyor cunku object create etmedin

        System.out.println("======================================");

        System.out.println(b);    // cunku static

        System.out.println(staticMethods.b);

        System.out.println(obj.b);  // warning veriyor. prefers to be called throuh class  name
    }



        public void method(){
            System.out.println(a);

            System.out.println(b);   // accepets static ve instance method heryerde kullanabiliyorsun cagirabiliyorsun
        }









}
