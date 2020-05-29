package IntervievQuestions.Ouiz;

public class Test {

    int x;          // instance variable
    int y ;

    public Test(int x,int y) {     // constructor method  with argument
        initialize(x, y);           // burasi local variableden aliyor
    }
        public void initialize(int x,int y){            // instance method
        this.x=x*x;               // calling from instance variable
        this.y=y*y;
        }

    public static void main(String[] args) {
        int x=3;               // local variable   // instance variable ile ayni degiller
        int y=5;

        Test obj=new Test(x,y);
        System.out.println(x+" "+y); //3,5        // local variable they have closer relationship methods than instance variables
        // local variableden aliyor sonucu
    }

}
