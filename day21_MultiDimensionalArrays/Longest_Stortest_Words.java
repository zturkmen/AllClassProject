package day21_MultiDimensionalArrays;

public class Longest_Stortest_Words {

    public static void main(String[] args) {
        /*
        2. write a program that can return the logest string of text from an array
	3. write a program that can return the shortest string of text from an array
         */

        String[] names={"Reem","Omer","Muhtar","Emrah","Mohammed","Ana"};

        int maxLengthString = names[0].length(); //4
        int minLengthString = names[0].length();

        String logestword = "";
        String shortestWord = "" ;

        for(int i = 0; i < names.length ; i++  ){

            if(names[i].length() > maxLengthString ){
                maxLengthString = names[i].length();
                logestword = names[i];
            }

            if(names[i].length() < minLengthString){
                minLengthString = names[i].length();
                shortestWord = names[i];
            }

        }


        System.out.println(logestword);
        System.out.println(shortestWord);






    }
}