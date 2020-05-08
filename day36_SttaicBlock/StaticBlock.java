package day36_SttaicBlock;

public class StaticBlock {

    static{

        System.out.println("Hello Word");         // first outprint mainden once yazdiriyor mainden sonra bile yazilsa once o cikti aliyor

    }

    public static void main(String[] args) {
        System.out.println("Hello Cybertek");
    }

    static{

        System.out.println("static block executed");         // first outprint mainden once yazdiriyor mainden sonra bile yazilsa once o cikti aliyor
                 // sadece one time executed
    }




}
