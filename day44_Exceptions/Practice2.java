package day44_Exceptions;

public class Practice2 {

    public static void main(String[] args) {
        System.out.println("java");
      //  waits();
      //  waits(5);
        waits(3.5); // bunu kullanmak istiyorsan methodda int i double a cevireceksin
        System.out.println("cybertek");
    }

  /*  public static void waits() {  // bu yolla yaparsan yukarda sadece waits()  yazip cagiriisin without arguments
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
    }
*/
  /*  public static void waits(int seconds) {   // bu yolla yaparsan with argument waits()  numara yazmalisin

        try {
            Thread.sleep(seconds*1000);
        } catch (Exception e) {
        }
    }
*/
     public static void waits(double seconds){
         try {
             Thread.sleep((long)(seconds*1000));   // bunu yapmalisin eger double kullanacaksan cunku thread sleep
             // sadece long kabul ediyor ve double long a cevirmen lazim
         } catch (Exception e) {
         }
     }

}
