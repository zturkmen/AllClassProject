package day04_JavaRecap;



public class Variable_Practice {
    public static void main(String[] args) {

    // DataType variableName=;
        byte num1 = 127;
        short num2 = num1;  //double>float>long>int>short>byte
        // byte num3 = num2;
        int num4 = num2;   // int is prefered by compiler
        long num5 = 9999999999l;
        float num6 = 100l;
        System.out.println(num6);
        float num7 =0.5f;
        System.out.println(num7);
        double num8 =0.5f;
        double num9 =9999999l;
        double num10 = 100.5;
        System.out.println(num10);

        char ch1= '$';
        System.out.println(ch1);
        char ch2 = 22000;    //0-65565 rate
        System.out.println(ch2);

        int a1 = '8';
        System.out.println(a1);
        int a2 = 'z';          // 122
        System.out.println(a2);

        double d1 = 'z'+'8';
        System.out.println(d1);
        char ch4 ='z'+'8';
        System.out.println(ch4);

        boolean bool1 =true;
        boolean bool2 =false;
        System.out.println(9>10);
        System.out.println(9>=9);
        System.out.println(9!=10);
        System.out.println('a'=='b');
        //System.out.println('a'=="a");   // ' ' does not match
        System.out.println('a'=='b'-1);
                           // 97==98-1
                          // 97==97    true
        System.out.println("muhtar"== "good guy");   //false
            //             muhtar == good guy ==>   false
        //System.out.println("muhtar"!== "good guy");   //true

        System.out.println("muhtar" == "muhtar");   //false

       // System.out.println("cybertek"==10000);

        boolean r1 = !true; //false

        System.out.println(r1);
        System.out.println(!r1);

        System.out.println(!true ==false);
        System.out.println(!true !=!false);















    }
}
