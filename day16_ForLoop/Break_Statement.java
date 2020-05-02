package day16_ForLoop;

public class Break_Statement {
    public static void main(String[] args) {

        for(int i =1; i<=5; i++){
            System.out.println("Hello World");
            break;
        }
           //  if(i==3){           ==================> eger boyle yazarsam kacincidan sonra dursun demek  2 defa yazdirip sonra duracak
            //     break;
            // }


        for(char i='a'; i<='z'; i++){
            System.out.println(i);
            if(i=='d'){
                break;
            }
        }

    }
}
