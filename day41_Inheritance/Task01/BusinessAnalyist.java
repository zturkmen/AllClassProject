package day41_Inheritance.Task01;

public class BusinessAnalyist extends Employee{   // employee clasdaki variableleri tekrardan yazmamak icin buraya cagirmak icin extends yapiyoruz
    /*
    create subclass of employee name it businessAnalyst
     		variables: salary, name, id, jobTitle, gender
     		actions: writingRequiremnts, gathering
     		creata a constructor that can initialize all the attributes of businessAnalyst


     */
    public BusinessAnalyist (double salary, String name, long id, String jobTitle, char gender){
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void writingReq(){
        System.out.println(name+" is writing requirements");    // businessanaliyist classda biz name isimini kcall edebiliriz cunku inheritance
        // compiler error vermez variable tanimlamazsakta bu classda zaten tanimli inharitance oldugu icin
    }
    public void gathering(){
        System.out.println(name+" is gathering requirements");
    }










}
