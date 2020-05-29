package IntervievQuestions.Ouiz;

class Caller{
    private void init(){         //line1
        System.out.println("initialized");
    }

    private void start(){
        init();         //line 2
        System.out.println("started");
    }

}
public class TestCall {
    public static void main(String[] args) {
        Caller C=new Caller();
      //  C.start();      //line 3          3 ve 4 compiler error private sadece in class da gorulur
      //  C.init();       //line 4
    }

}
