package day15_ForLoop;

public class ReserveString {
    public static void main(String[] args) {
        String str = "Universal";  //avaJ
        //    012345678

        String reverse1 = "" + str.charAt(3) + str.charAt(2) + str.charAt(1) + str.charAt(0);
        int lastIndexnum = str.length()-1;

        String reverse2 = "";
        for(int i = lastIndexnum; i>=0 ; i-- ){
            //  System.out.print(str.charAt(i));
            reverse2 += str.charAt(i);
        }

        System.out.println(reverse2);


        /*
        write a program to idenfiy if a string is palindrome or not. if yes==> true,.otherwise ==> false
                level ==> level ==> palindrome
         */

    }
}
