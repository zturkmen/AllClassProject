package day41_Inheritance.Task02;
/*
create sub class of BankAccount and name it checkingAccount
			variables: accountNumber, accountHolder, balance
			methods: deposit, withDraw, showBalance

 */
public class CheckingAccount extends BankAccount{     // sub class
    /*
    accountNumber  inherited
    accountHolder   inherited
    balance       inherited

    deposit inherited
    withDraw   not
    showBalance  inherited
    toString inherited
    */

    public void withdraw(int amount){    // para cunku   // buna static ekleyemiyoruz cunku balance variable instance
        // onu cagirabilmek icin methodda sttaic olmuyor
        balance-=amount;    // balance duser withdrwa oldugunda cunku
    }




}
