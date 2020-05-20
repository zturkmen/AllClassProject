package day42_Inheritance;

public class TestData2 extends Accessmodifiers{   // subclass        //   superclass



    public static void main(String[] args) {
        System.out.println(TestData2.publicVariable);
        // variable sttaic oldugu iicn dogrudan boyle cagirabiliyorum object create etmeden

        System.out.println(TestData2.protectedVariable);
        System.out.println(TestData2.defaultVariable);
       // System.out.println(TestData2.privateVariable);  never can call

        TestData2.publicMethod();
        TestData2.protectedMethod();
        TestData2.defaultMethod();
       // TestData2.privatemethods();  you cant call
    }

}
