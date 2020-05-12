package day37_Constructors;

public class CybertekStudents {

    static String schoolName;      //we dont have to in constructur cunku sttaic herkes icin ayni ve ayni kullancaz
    String studentName;   // we must need to know
    int groupNumber;  // we must need to know
    String batch;  // we must need to know


    public CybertekStudents(String studentName,int groupNumber,String batch){
       schoolName="Cybertek University";   // i can use in constructor because static variable global variable . thats mean i can use everyWhere. using without this.
      // eger burayi commet yaparsam bir sonrakilerin sonucunda hepsini en son olana gore veriyor yapmzasam burdan getiriyor degistirmedigim her objecin kini

        this.studentName=studentName;    // static variable varsa onu constructor iicnde bunlar giib yazmama gerek yok
        this.groupNumber=groupNumber;
        this.batch=batch;

    }

    public String toString(){
        return "Name: "+studentName+", Batch: "+batch+", in group: "+groupNumber+", School name: "+schoolName;
    }

}
class Cobjects{
    public static void main(String[] args) {

        CybertekStudents student1=new CybertekStudents("Zuleyha",18,"Batch 18");
        // CybertekStudents student1=new CybertekStudents("Zuleyha",18,"Batch 18","Cybertek Universty");
        // bunun icine Cybertek Univesrity yazdigim zaman compiler error veriyor static oldugu icin always be school name Cybertek Universty.
        // tanimlamadan run edince otomatik verecek
        student1.schoolName="Cybertek School";  // burda degismis oluyor school name static oldugu icin

        System.out.println(student1);


        CybertekStudents student2=new CybertekStudents("Omer",6,"Batch18");
        System.out.println(student2);


       // student1.schoolName="Cybertek School";

       // System.out.println(student1); // Zuleyha, Batch: Batch 18, in group: 18, School name: Cybertek School  degismis bir sekilde veriyor sonucu
        // ama bunu yukarida student1 den once yazarsam bana sonuc cybertek school olacak






    }
}