package OfficeHours.Practice_05_20_2020;

public class Dog extends Pet{
     /*
	Dog:
		variables:	name, age, color, size, breed, isPet, numberOfeyes
		methods: eat, sleep, drink, toString, bark
    not inherited: bark
     */


    public Dog(String name, int age, String color, String size, String breed){
        setInfo(name,age,color,size,breed);     // burda setinfo yapmayip this.name=name gibi de kullanabilirdik
        // eger pet de setinfo yazmasaydik da bu sonucu olurduk this.nam=name gibi
    }

    public void bark(){
        System.out.println(name+ " is barking");
    }

}
