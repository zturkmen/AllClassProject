package day34_CustomClass;

public class CapitalOne {
    public static void main(String[] args) {

        Tester tester1=new Tester();
        tester1.setTesterInfo("Muhtar",123,"Manual Tester", 1540000);

        ScrumTeam scrum=new ScrumTeam();
        scrum.hireTester(tester1);

        System.out.println(scrum.testersTeam);   // 1 olan testeri bilgilerini veriyor
        System.out.println(scrum.testersTeam.size()); // 1 how many tester var


        scrum.fireTester(123);
        System.out.println(scrum.testersTeam.size());    //0 tester




    }


}
