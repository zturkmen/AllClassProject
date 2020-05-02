package day20_ArraysContinue;

import java.util.Arrays;

public class deneme1 {
    public static void main(String[] args) {

        int [] table={1,2,3};
        int [] table2={4,5};
        int [] table3 ={1,2,3,4,5};

        int count=0;

        for(int i=0; i<table.length; i++){

            table3[count]=table[i];
            count++;
        }
        for(int i=0;i<table2.length;i++){
            table3[count]=table2[i];
            count++;
        }
        System.out.println(Arrays.toString(table3));



    }
}
