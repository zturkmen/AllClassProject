package day24_Methods;

public class StringReverse {
    public static void main(String[] args) {
        // String t = Reverse("Cybertek");

        String name =  Reverse2("Cybertek");

       System.out.println(name);

    }


    public static void Reverse(String str){  // ABCD
        String Reverse = "";

        for(int i = str.length()-1; i >= 0; i-- ){
            Reverse  += str.charAt(i);
        }
      // System.out.println(Reverse);            //   void oldugu icin return yazdiramiyorum.

    }


    public static String Reverse2(String str){              // buraya yazdigim variable turu neyse onu return
        // etmem lazim return um String oldugu icin bunu yazdim.
        String Reverse = "";

        for(int i = str.length()-1; i >= 0; i-- ){
            Reverse  += str.charAt(i);
        }
       //  System.out.println(Reverse);     //  bunu yzdiramiyorum cunku return  la yazdirmam lazim cunku void yok.
        return  Reverse;
    }
                  // void yazdiginda coda return etmek gerek yok yani sout yapmadan isleme devam edebilirsin ama void
    // yoksa actigin method muhakkak return yapmak zorunda yoksa hata veriyor.




}
