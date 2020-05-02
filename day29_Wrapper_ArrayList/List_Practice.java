package day29_Wrapper_ArrayList;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class List_Practice {
    public static void main(String[] args) {

        ArrayList<String>shoppingList=new ArrayList<>();

        shoppingList.add("Milk");   // size:1
        shoppingList.add("Coffee");   // size:2
        shoppingList.add("Bread");   // size:3
        shoppingList.add("Toilet Paper");   // size:4

        System.out.println(shoppingList);

        System.out.println(shoppingList.get(0));            // tek tek yapmak
        System.out.println(shoppingList.get(1));
        System.out.println(shoppingList.get(2));
        System.out.println(shoppingList.get(3));

        System.out.println("==========================================");

        for(int i=0; i<4; i++){                    // kisa yolu sadece saydiriyorsun    eger bilmiyorsam 4 den fazlaysa size ile yapiyorsun asagida
            System.out.println(shoppingList.get(i));

        }


        System.out.println("================================================");

        for(String each:shoppingList){              // for each ile yapilmasi
            System.out.println(each);
        }
        System.out.println("==========================================");

         // size() :
        //shoppingList.size();
        int size=shoppingList.size();
        System.out.println(size);       // kac tane oldugunu veriyor

        // eger eklersen bir tane daha en uste shoppling liste otomatik olarak 5 verecek outprintte
        // ama for loopta 4 u 5 e cevirmen lazim cunku sadece 4 tanesini verir saydirir yada

        /*
        for(int i=0; i<shoppingList.size(); i++){                 // length nasil veriyor 4 yerine yaziyorsun
            System.out.println(shoppingList.get(i));

        }
         */


        int lastIndex=shoppingList.size()-1;
        System.out.println(lastIndex);           // 3







    }
}
