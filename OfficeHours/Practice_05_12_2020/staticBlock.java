package OfficeHours.Practice_05_12_2020;

public class staticBlock {

    static String str;

    static{
        str="Cybertek";
        str="Harvard";
        str="MIt";

    }
  public static void main(String[] args) {
      str="Cybertek";    // eger burayi // yaparsam yukarda tanimlananin en sonuncunsunu veriyor
      System.out.println(str);
  }
}

class staticBlockTest{

    public static void main(String[] args) {            // bu static blocktan geliyor sonuc eger onu kapatirsam sonuc null oluyor
        System.out.println(staticBlock.str);
    }
}
