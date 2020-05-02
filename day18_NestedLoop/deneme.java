package day18_NestedLoop;

public class deneme {
    public static void main(String[] args) {



        for(int j=1; j<=7; j++){

            for(int i=1; i<=7; i++){
                System.out.print("b ");
            }
            System.out.println();
        }
        System.out.println("=========================================");

        for(int x=1; x<=6; x++){
            for(int y=1; y<=x; y++){
                System.out.print("y ");
            }
            System.out.println();

        }

        System.out.println("=========================================");


      for(int a=6; a>=1; a--){
          for(int b=1; b<=a; b++){
              System.out.print("* ");
          }



          System.out.println();
      }










    }
}
