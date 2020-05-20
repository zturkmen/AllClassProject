package day41_Inheritance.Task02;

public class AccountObjects {
    public static void main(String[] args) {

        CheckingAccount obj=new CheckingAccount();

        obj.accountHolder="Saban";



        obj.showBalance();
        System.out.println(obj);  //we havent initalized yet   //Name: null, balance: 0.0

        obj.deposit(25000);
        obj.showBalance();   //25000
        obj.withdraw(10000);
        obj.showBalance();     //15000
        System.out.println("==============================================================");

        SavingAccount saving=new SavingAccount();
        saving.accountHolder="Elif";
        saving.showBalance();
        saving.deposit(10000);
      //  saving.withdraw();  cagiramiyorsun cunku saving accountta tanimli degil bu
        System.out.println(saving.interestRate);
        System.out.println(saving);






    }


}
