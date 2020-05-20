package day42_Inheritance;

public class TestData extends Data{
/*
    public: accessible at everywhere, visibile to the world
    protected: visible in same package, visible in sub class outisde packagfe
     //protected is always visibile to any subclass
    default: only visible in same package
    private: only visible within the same class
 */

    /*
    public
    default
    protected
     */
    public static void main(String[] args) {

        System.out.println(TestData.publicData);
        System.out.println(TestData.protectedData);
        System.out.println(TestData.defaultData);
     // System.out.println(TestData.privateData);  you cant call private because it just only same class. here is the different class.
        // private can never be inherited



    }
}
