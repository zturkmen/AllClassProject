package OfficeHours.Practice_05_06_2020;

public class Developer {
/*
create a class called Developers
			Attributes:
				name, employeeId, JobTitle, Salary
			Actions:
				setDeveloperInfo(), coding(), fixingBugs()

 */

          String name;
          String jobTitle;
          double salary;
          long employeId;

    public void setInfo(String name, String jobTitle,double salary,long employeId){

        this. name=name;   //user given argument name is assigned to instance variable name
        this.jobTitle=jobTitle;
        this.salary=salary;
        this.employeId=employeId;

    }


    public String toString(){

        return  "Employee name: " + name + " , Employee ID: " + employeId + " , Job title: " + jobTitle + " , salary: "+salary;
    }

     public void coding() {

         System.out.println(name + " is coding");

     }

     public void fixingBug (){

        System.out.println(name+" is crying");



         }



}
