package day17_WhileLoops;

public class PalindromeTest {
    public static void main(String[] args) {
        String str="Java";

        String reverseStr="";    // store the reversed version of str


        int index= str.length()-1;
        while(index>=0){
           reverseStr+= str.charAt(index);
            index--;
        }

        boolean palindrome=reverseStr.equals((str));
        System.out.println(palindrome);

/*
 String word="Devlet";                second solution ve kolay olani
          String rev="";

          for(int i=word.length()-1; i>=0; i--){
              rev+=word.charAt(i);

          }
          boolean pal=rev.equals(word);
        System.out.println(pal);

 */




    }
}
