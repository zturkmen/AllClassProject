package day39_AccessModifiers;

public class CheckInfo {
    public static void main(String[] args) {

        System.out.println("Name: "+ PersonallInfo.name);
        System.out.println("Gender: "+PersonallInfo.gender);

        System.out.println("Grade: " + PersonallInfo.grade );
        System.out.println("Age: "+PersonallInfo.age);

        //  System.out.println( "SSN: "+PersonalInfo.SSN ); // private is only accessible with in same class
        //  System.out.println( "ID: "+PersonalInfo.ID );


        PersonallInfo obj = new PersonallInfo();
        System.out.println( obj.name);
        System.out.println( obj.gender);

        System.out.println(obj.grade);
        System.out.println(obj.age);

        //  System.out.println(obj.SSN);
        //  System.out.println( obj.ID );


    }
}
