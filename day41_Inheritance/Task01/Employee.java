package day41_Inheritance.Task01;

public class Employee {
/*
Task:
	creata  class called Employee:
			variables: salary, name, id, jobTitle, gender
			Actions: toString
 */
   public double salary;
   public String name;
   public long id;
   public String jobTitle;
   public char gender;

public String toString(){
    return "Name: "+name+" JobTitle: "+jobTitle+" Salary: $"+salary+" ID: "+id+" Gender: "+gender;
}


}
