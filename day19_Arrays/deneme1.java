package day19_Arrays;

public class deneme1 {
    public static void main(String[] args) {

        // PALONDROME ORNEK


          String word="Devlet";
          String rev="";

          for(int i=word.length()-1; i>=0; i--){
              rev+=word.charAt(i);

          }
          boolean pal=rev.equals(word);
        System.out.println(pal);










    }
}
