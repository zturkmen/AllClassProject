package OfficeHours.Practice_05_06_2020;

public class Tester {
    /*
    create a class called testers

    Attributes:
    name, employeeID,jobtitle,salary

    actions:
    settesterinfo(), smoketesting(), creatingticket().
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


    public void smokeTesting(){

       // int name=300;  asagiya neden this.name vermemmin nedeni
        System.out.println(this.name+ " is doing smoke testing");  // cunku baska bir name olan variable olabilir biz sadece insance variable olsun istedigimiz icin bunu ayzdik
    }


    public void creatingTicket(){

        System.out.println(this.name+ " is creating ticket on jira");
    }







}
