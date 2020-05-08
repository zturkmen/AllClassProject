package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class BankOfAmerica {
/*
create a class called Bank Of America:
			bank of America is planning to create thier thier automation team, there fore they are hiring three testers
			create a list called AutomationTeam and store three Testers in it
			write a program that can remove the tester if he/she is manual tester
			write a program that can calculate the total budget of the Automation team

 */

    public static void main(String[] args) {
        Tester tester1= new Tester();
        tester1.setTesterInfo("Madina",111223554,"QA",2000000);

        Tester tester2= new Tester();
        tester2.setTesterInfo("Venera",111215554,"Manual Tester",1500000);

        Tester tester3= new Tester();
        tester3.setTesterInfo("Sha Rejepov",1111123554,"Senior SDET",1200000);

        Tester tester4= new Tester();
        tester4.setTesterInfo("Muhtar",651223554,"SDET",1200000);

        Tester tester5= new Tester();
        tester5.setTesterInfo("john",111223554,"Uber Driver",600000);

       // Tester [] testers={tester1,tester2,tester3,tester4,tester5};

        ArrayList<Tester> testers=new ArrayList<>();
        testers.addAll(Arrays.asList(tester1,tester2,tester3,tester4,tester5));

        testers.removeIf(p-> !p.jobTitle.contains("SDET"));

        double totalBudget = 0;
        for( Tester each :  testers){
            System.out.println(each);
            totalBudget += each.salary;
        }

        System.out.println(totalBudget);






    }

}
