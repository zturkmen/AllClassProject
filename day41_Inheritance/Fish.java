package day41_Inheritance;

public class Fish extends Animal{   // animal classdan buraya al demek
    // fish is sub class

    public void swim(){             // eger fish icin uniq olan bir action varsa buraya cretae edip yazdirabilirisn
        System.out.println(name+" is swimming");
    }

    public static void main(String[] args) {

        Fish obj1=new Fish();
        obj1.name="Nemo";
        obj1.weight=5;
        obj1.size="Small";

        obj1.eat();
        obj1.move();

        obj1.swim();  //Nemo is swimming    // yukariya crate ettim ve uniq burda cagirdim

       // obj1.bark();  this is unique for dog class and i dinot create here




    }

}
