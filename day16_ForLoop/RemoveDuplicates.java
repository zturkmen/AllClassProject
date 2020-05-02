package day16_ForLoop;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str= "abab";  //ab
        String result="";    //ab

     for(int i=0; i<=3; i++){
         /*
         if(!result.contains(""+str.caharAt(i))){  =======> other way to solution
         result+=str.charAt(i);
          */
         if(result.contains(""+str.charAt(i))){// if the result doesnot contains str..... if it does will not concate
             continue;
         }
         result+=str.charAt(i);
     }
        System.out.println(result);




    }
}
