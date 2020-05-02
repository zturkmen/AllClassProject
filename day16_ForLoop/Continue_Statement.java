package day16_ForLoop;

public class Continue_Statement {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){     //i: 1.2.3.4.5

            if(i==3){
                continue;
            }
            System.out.println(i);
        }


          for( int i=0; i<=20; i++){
              if(i%2!=0){      // skips all the odd number    // i%2==0 ======> for even number skip
                  continue;

              }

              if(i%2==0){
                  continue;          // hepsini silmis olduk aslinda skip yaptik even numberida burda yaptik

              }
              System.out.print(i+" ");
          }





    }
}
