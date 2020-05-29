package IntervievQuestions.Ouiz;

class Data{
    public void methodA(){
        System.out.println("Madina");
    }
}

public class Testt extends Data{      // line1
    public void methodB(){
        System.out.println("Aima");
    }

    public static void main(String[] args) {
        Data obj=new Data();
        obj.methodA();    // line2
       // obj.methodB();     // line3   //  cunku Data classda yok bu eger Testt classda olsaydi ikisinide alabilrdik
        // burda hata var soruda
    }
}
