package day09_Nestedlf_Ternary;

public class ageGroups_NestedIf {
    /*
    write a programthat can define the age groups of a person age groups are:
    Teenager (<21)
    Adult (>=21 && <55 )
    Senioe ( >55)
    age cannot be negatif or greater than 150
     */
    public static void main(String[] args) {

    int age = 27;
    String ageGroup = " ";
    if(age <150 && age >= 0 ){

        if(age<21 ){                 // there is already > 0
            ageGroup = "Teenager";
        }else if(age< 55){
            ageGroup = "Adult";
        } else{
            ageGroup = "Senior";
        }


    }else{
        ageGroup = "Invalid Entry";

    }

        System.out.println(ageGroup);


        System.out.println("===============================================================");

        int age2 = 45;
        String ageGroup2 = " ";

           if(age2 < 150 && age2 >0){

               ageGroup2 = (age2 < 21 )? "Teenager" : (age2 <55) ? "Adults" : "Senior";



           }else{
               ageGroup2 = "Invalid Entry";
           }
        System.out.println(ageGroup2);












    }



}
