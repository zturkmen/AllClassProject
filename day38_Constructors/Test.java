package day38_Constructors;

import org.w3c.dom.ls.LSOutput;

public class Test {

    static{
        System.out.println("Static blocks");
    }

    {
        System.out.println("Instance blook");
    }

    public static void main(String[] args) {
        new Test();
    }

    static{
        System.out.println("Static block");
    }




















}
