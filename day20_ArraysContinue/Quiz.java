package day20_ArraysContinue;

import java.util.Arrays;

public class Quiz {
    public static void main(String[] args) {

        String[] names={"Mehmet","Aizhan"};

        names[0]=names[1];

        names[1]=names[0];

        System.out.println(Arrays.toString(names));




    }

}
