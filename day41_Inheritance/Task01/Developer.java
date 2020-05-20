package day41_Inheritance.Task01;

public class Developer extends Employee{
    /*
    create subclass of employee name it developer:
	     variables: salary, name, id, jobTitle, gender
	     action: fixingBug, coding
	     creata a constructor that can initialize all the attributes of developer

     */

     /*
    Name  inherited
    salary inherited
    id inh
    jobTitle inh
    gender inh

    fixingBug()
    coding()
      */

    public Developer (double salary, String name, long id, String jobTitle, char gender){
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void fixingBug(){
        System.out.println(name+" is fixing the bug");
    }

    public void coding(){
        System.out.println(name+" is coding the code");
    }


}
