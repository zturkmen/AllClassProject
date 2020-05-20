package day41_Inheritance;

import java.util.ArrayList;
import java.util.Arrays;

/*
 create a class called Person
            attributes:  name, age, gender
            methods: eat, walk, sleep, setPersonInfo

 */
public class Person {

    public String name;
    public int age;
    public char gender;

    public void eat(){
        System.out.println(name+" is eating");
    }
    public void walk(){
        System.out.println(name+" is walking ");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    public void setPersonInfo(String name, int age,char gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

}
/*
create a sub class of person called Employee
            attributes: name, age, gender, Salary, employeeID, jobTitle
            methods: work, setEmployeeInfo, toString

 */
class Employee extends Person{
    public double salary;
    public long employeeID;
    public String jobTitle;


    public void work(){
        System.out.println(name+" is working");
    }

    public void setEmployeeInfo(String name, int age,char gender,double salary,long employeeID,String jobTitle){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.salary=salary;
        this.employeeID=employeeID;
        this.jobTitle=jobTitle;
    }

    public String toString(){
        return "Name: "+name+", Age: "+age+", Employee ID: "+employeeID+", Job Title: "+jobTitle+
                ", Salary: "+salary+", Gender: "+gender;
    }

}

/*
create a subclass of Person called Student
            attributes: name, age, gender, studentID, clazz
            methods: attendClass, code, setStudentInfo, toString

 */

class Student extends Person{

    public long studentID;
    public String classname;

    public void attendClass(){
        System.out.println(name+" is attending class");
    }

    public void code(){
        System.out.println(name+" is coding");
    }

    public void setStudentInfo(String name, int age,char gender,long studentID,String classname){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.studentID=studentID;
        this.classname=classname;
    }

    public String toString(){
        return "Student Name: "+name+", Age:"+age+", Gender: "+gender+", Student ID: "+
                studentID+", Class: "+classname;
    }

}
/*
create a class called school:
                create 3 objects of student and set thier info
                create a an ArrayList of students to store all student objects
                use for each loop to print out each students' name and studentID

 */

class School extends Student{
    public static void main(String[] args) {
        Student student1= new Student();
        student1.setStudentInfo("Ela",8,'F',1254,"A");

        Student student2= new Student();
        student2.setStudentInfo("Zuleyha",10,'F',12258,"B");

        Student student3= new Student();
        student3.setStudentInfo("Murat",12,'M',12754,"C");

        ArrayList<Student> studentsList=new ArrayList<>(Arrays.asList(student1,student2,student3));
        for(Student each:studentsList){
            System.out.println(each.name+" "+each.studentID);
        }
    }
}

/*
create a class called company:
                create 3 objects of employee and set thier info
                create an array of employees and store all those employee objects
                use regular for loop to print out each employee' name and employeeID
 */
class Company extends Employee{
    public static void main(String[] args) {

        Employee employee1=new Employee();
        employee1.setEmployeeInfo("Ela",25,'F',120000,145,"QA");

        Employee employee2=new Employee();
        employee2.setEmployeeInfo("Zuleyha",30,'F',150000,14415,"Developer");

        Employee employee3=new Employee();
        employee3.setEmployeeInfo("Murat",35,'M',120000,1445,"Tester");

        ArrayList<Employee> employeeList=new ArrayList<>(Arrays.asList(employee1,employee2,employee3));

        for(Employee each: employeeList){
            System.out.println(each.name+" "+each.employeeID);
        }

    }


}




