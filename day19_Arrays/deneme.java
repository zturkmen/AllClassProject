package day19_Arrays;

public class deneme {
    public static void main(String[] args) {
        /*
         /*
         1. write a program that can return the unique characters from a string
        Ex:  "AABCC" ==> "B"

         */
        String str = "chdnjjsbbskkv";
        String result="";

        for(int j=0; j<=str.length()-1; j++){
            int count=0;
            for(int i=0;i<=str.length()-1; i++){
                if (str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                result+=str.charAt(j);
            }

        }
        System.out.println(result);


        String name="ZULEYHA"; //ZULEYHA
        String result2="";

        for(int i=0; i<=name.length()-1;i++){
            int count1=0;
            for(int a=0; a<=name.length()-1; a++){
                if(name.charAt(i)==name.charAt(a)){
                    count1++;
                }
            }if(count1==1){
                result2+=name.charAt(i);

            }

        }
        System.out.println(result2);



        String name1="DEVLET"; //
        String result1="";

        for(int b=0; b<=name1.length()-1; b++){
            int count1=0;
            for(int c=0;  c<=name1.length()-1; c++){
                if(name1.charAt(b)==name1.charAt(c)){
                    count1++;
                }
            }if(count1==1){
                result1+=name1.charAt(b);
            }
        }
        System.out.println(result1);

























    }
}
