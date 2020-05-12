package day36_SttaicBlock;

public class staticBlock3 {

    static String name;
    static int num;


    static{
        name="Muhtar";
        num=100;
    }


    public static void main(String[] args) {

        name="Muhta";
        num=200;

        System.out.println(name);
        System.out.println(num);


    }
    // bunu yaptigimda test classda yazdiramiyorum ihtiyacim olan static block first









}
