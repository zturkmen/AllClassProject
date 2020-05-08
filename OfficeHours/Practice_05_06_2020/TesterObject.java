package OfficeHours.Practice_05_06_2020;

public class TesterObject {

    public static void main(String[] args) {

        Tester tester1=new Tester();

        tester1.name="Muhtar";
        tester1.jobTitle="SDET";  // inisiliaze yaptigim icin tester1 out yaziyor name jobtitle
        tester1.salary=90000;
        tester1.employeId=123456;

        System.out.println(tester1);  // ne yazarsam toString e onu veriyor out olarak


        Tester tester2=new Tester();

        tester2.setInfo("Zuleyha","QA",100000,2564541);   // yukardaki tester1.name="Muhtar" ile ayni islem
        System.out.println(tester2);

        tester1.smokeTesting();
        tester2.smokeTesting();

        tester1.creatingTicket();
        tester2.creatingTicket();


    }

}
