package day11_Scanner;

import java.util.Scanner;

public class denem {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

      /*
      4. Revenue can be calculated as the selling price of the product times the quantity sold,
      i.e. revenue = price × quantity.
      Write a program that asks the user to enter product price and
      quantity and then calculate the revenue. If the revenue is more
      than 5000 a discount is 10% offered.
      Program should display the discount and net revenue.
       */

      System.out.println("Enter the product price");
      double price = input.nextDouble();
      System.out.println("quantity");
      double quantity = input.nextDouble();

      double revenue= price*quantity;
      double discount= 10;
      double result= revenue-(revenue*discount/100);


      if(revenue>5000){
          System.out.println(result);
      }else{
          System.out.println(revenue);
      }













    }
}
