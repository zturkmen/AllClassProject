package day10_Switch_Scanner;

import java.util.Scanner;

public class deneme20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! Welcome to our marketplace; \n TahaRukiye Markets.");
        System.out.println("First, I should learn how much do you have? Can you please enter your money amount as ₺?");
        int walletCustomer = input.nextInt();
        System.out.println("So, you have " + walletCustomer + "₺. What do you want to buy?");
        System.out.println("1. Cow Meat (50₺) \n 2. Chicken (20₺) \n 3. Lamp Meat (40₺) \n 4. Nothing");
        System.out.println("Can you please enter the number of what do you want?");
        int taken = input.nextByte();
        String lastWords = " ";
        switch (taken)
        {
            case 1:
                walletCustomer -= 50;
                System.out.println("You want cow meat? Here you are... Have a nice day sir" + lastWords);
                break;
            case 2:
                walletCustomer -= 20;
                System.out.println("You want chicken? Here you are... Have a nice day sir" + lastWords);
                break;
            case 3:
                walletCustomer -= 40;
                System.out.println("You want lamp meat? Here you are... Have a nice day sir" + lastWords);
                break;
            case 4:
                System.out.println("Allright! See you later then...");
        }
        lastWords = "You have " + walletCustomer + "₺ left.";
        System.out.println(lastWords);



    }
}
