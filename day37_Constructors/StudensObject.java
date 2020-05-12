package day37_Constructors;

public class StudensObject {
    public static void main(String[] args) {


      /*  Student student1 = new Student();   // Student classda variable olmasina ragmen default oldu verince compelir error verdi
        student1.setInfo("Marina",34,'F',"Cybertek");

        System.out.println(student1);// hascode   toString tanimlanmadiysa

*/


        Student student1 = new Student("Marina", 34, 'F', "Cybertek");
        // constructor methoddan geliyor

        //student1.setInfo("Marina", 34, 'F', "Cybertek");

        System.out.println( student1 );   // to string tanimladigin icin cikti verecek

        Student student2 = new Student("Sha",35,'M',"Harvard");

        System.out.println(student2);


    }
}
