package day41_Inheritance;

public class Dog extends Animal {             // buraya yazdigin extend kelimesi okuyor name i
    // dog is sub class

    /*
      public String name;
    public String size;
    public double weight;

    public void eat(){
        System.out.println(name+" is eating ");
    }

    public void move(){
        System.out.println(name+" is moving");
    }
     */

    public void bark(){
        System.out.println(name+" is barking");
    }

    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.name="Lucy";      // eger yukarda extends yazmasan okumayacak name i

        System.out.println(dog1.name);

        dog1.move();   // Lucy is moving
        dog1.eat();   // Lucy is eating

       // dog1.swim();  i can because this is uniqu for fish and i dinot create here

        dog1.bark();



    }


}
