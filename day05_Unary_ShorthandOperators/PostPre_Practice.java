package day05_Unary_ShorthandOperators;

public class PostPre_Practice {

    public static void main(String[] args) {
        int a = 50;

        a = --a + a++ + a-- + a++;
        //49+49+50+49

        System.out.println(a);  //197
        System.out.println(++a); //198
        System.out.println(a++);  //198
        System.out.println(a);  //199

        int b = 1;
        b = -b-- + b++ / -b-- * --b;
        // -1 + 0 /-1 * -1
        // -1+0*-1
        //-1+0
        //-1
        System.out.println(b);

        System.out.println("result b" + (1)+ (2));

        System.out.println("5+2 ="+3+4);
        System.out.println("5+2="+ (3+4));

        long a8 =30L;
        long b8= (short)a8;
        System.out.println(b8);

        float a10 = 100.987_6543f;
        short b10 = (byte)a10;
        byte c10=(byte)b10;
        System.out.println(c10);



    }
}
