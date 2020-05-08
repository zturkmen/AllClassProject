package day35_Static;

public class staticPractice2 {

    String brand;
    String Model;
    static boolean hasWheels=true;

      public void printBrand(){     // static olmadiginda method un icinde instance method oluyor
          // method instance oldugu icin brand dogrudan yazdirabiliyorsun diger turlu hayir yani methodun icinde void den once static yok

          System.out.println(brand);

}


         public void printModel(){
             System.out.println(Model);

         }

    public  static void main(String[] args) {
        System.out.println(hasWheels);    // yukarda static variable oldugu icin kullanabildim
        // kullanmak istiyorsam methodun static olmamasi gerekiyor variable i sttaic tanimlamayacaksam

    }






}
