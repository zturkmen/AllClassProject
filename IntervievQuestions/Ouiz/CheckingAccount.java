package IntervievQuestions.Ouiz;

public class CheckingAccount {

    public int amount;
// line 1

   /* {
        this.amount=100;
    }

    */

   public CheckingAccount(){          // constructor acip 100 sonucunu alabiliriz.
       amount=100;    // 1
       this.amount=100;   // 2      // ikisinnide kullanabilirim
   }
    public static void main(String[] args) {          // static method only accepts static
       // amount instance variable directly cagiramayiz object create ederek cagirmaliyiz
        CheckingAccount acct=new CheckingAccount();
       //line 2

        acct.amount=100; // 3     // objecle cagirabiliyorum instance variable i direkly degilde
        System.out.println(acct.amount);



        // 3 tanesi dogru olacak
    }
}
