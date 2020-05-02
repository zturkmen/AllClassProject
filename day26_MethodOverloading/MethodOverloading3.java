package day26_MethodOverloading;

public class MethodOverloading3 {

    public static void main(String[] args) {

        sum(10,20);
        sum(1.5,2.5);

        //10,15.5
       double num1= sum(10,15.5);
        System.out.println(num1);

       //25L, 30L
        double num2=sum(25L,30L);    // cunku L casting double

        //5,4
      //  double num3=sum(5,4);  void method doesnot any value

        //40L,50L
        sum((int)40L, (int)50L);     //    only parameter matters when the overloading


    }
    public static void sum(int a, int b){
        System.out.println(a+b);

    }
    public static double sum(double a, double b){    // in method overloading, return type does not mather
        return a+b;
    }






}
