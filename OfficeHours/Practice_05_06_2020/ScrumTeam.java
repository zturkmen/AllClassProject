package OfficeHours.Practice_05_06_2020;

import java.util.ArrayList;

public class ScrumTeam {
   // toplam tester ve devl eklicez buna
    ArrayList<Tester> testersTeam=new ArrayList<>();    // for this tester hire and fire
    ArrayList<Developer> devpTeam=new ArrayList<>();    // for this hire and fire for developer

    public void hireATester(Tester tester){       //  class //name   instance method
        testersTeam.add(tester);     // bu arrayliste ekleniyor

    }

    public void fireATester(long id){
        testersTeam.removeIf(p->p.employeId==id);    // p eachtester demek


    }

    public void hireADeveloper (Developer developer){
        devpTeam.add(developer);
    }

    public void fireADeveloper(long id){
        devpTeam.removeIf(p->p.employeId==id);
    }





}
