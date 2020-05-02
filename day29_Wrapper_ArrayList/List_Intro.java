package day29_Wrapper_ArrayList;
import java.util.ArrayList;
import java.util.Arrays;

public class List_Intro {

    public static void main(String[] args) {
       // ArrayList<int>scores=new ArrayList<int>();   hata veriyor cunku pritive desteklemiyor. primitivr not class


     //   ArrayList<Integer>scores=new ArrayList<Integer>();      // integer primitive degil class and integer excepts int

                 // mandatory (zorunlu)          (optinal)


        ArrayList<Integer>scores=new ArrayList<>();         // how to create

        scores.add(10);   // autoboxing size :1
        scores.add(20);     // autoboxing size: 2
        scores.add(30);
        System.out.println(scores);          //[10,20,30]


     //   scores.get(2);             //integer

        Integer a1=scores.get(2);       // none
        int a2=scores.get(2);               // unboxing
        double a3=scores.get(2);             //unboxing

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

      //  System.out.println(scores.get(100));         // index out of bound   cunku en buyk index 2













    }





}
