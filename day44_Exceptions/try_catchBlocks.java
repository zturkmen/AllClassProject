package day44_Exceptions;

import java.util.ArrayList;
import java.util.Arrays;

public class try_catchBlocks {
    public static void main(String[] args) {
        System.out.println("Test started");

        ArrayList<Integer>List =new ArrayList<>(Arrays.asList(1,2,3,4,5));



        try{
            System.out.println(List.get(10));
        }catch(IndexOutOfBoundsException e){
            // IndexOutOfBoundsExpection run ettikten sonra cikan kirmizi yazi  ayni zamanda tablodan aliyor ismi super classdan
            // exception hepsinin super class oldugu icin bunu yazarsan yeterli oluyor hepsini cover ediyor
            // ilki kesin ikincisi yani      e istedigini verebilirsin
            System.out.println("Something went wrong");
            // buaya yazdiginida out ediyor ama olmasa burdaki sadece en ust ve alttakini run ediyor

        }

        System.out.println("Test completed");

    }
}
