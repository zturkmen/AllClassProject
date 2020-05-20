package day41_Inheritance.Task01;

public class EmployeeObject {

    public static void main(String[] args) {
        Developer dev1=new Developer(120000,"Namik",123,"SDET",'M');
       // dev1.reporting();  i cant call
        dev1.fixingBug();
        System.out.println(dev1);


        Tester tester1=new Tester("Zuleyha",150000,145,"QA",'F');
        tester1.reporting();
        tester1.testing();
       // tester1.coding();  you cannot call cunku no relative between them
        System.out.println(tester1); //Name: Zuleyha JobTitle: QA Salary: $150000.0 ID: 145 Gender: F
        // hascode vermiyor tester class ta toString yazamdigimiz halde cunku tester
        // class extebd Employye class yani oraya yazmam yeterli oldu.
        // tostring olmasa hascode vereckti


        BusinessAnalyist BA1=new BusinessAnalyist(120000,"Ozgur",145,"BA",'M');
        BA1.writingReq();
        BA1.gathering();

        System.out.println(BA1);   // toString method inher from class Employe




    }
}
