package day33_CustomClass;

public class Carpet1_WarmUp {
    /*
    2. create a custom class for the carpet class that should contain the following:

                instance variables:
                        width, length, unitPrice, isPersian (boolean)
                instance methods:
                        customOrder(): sets the carpet' width, length, unitprice, & isParsian
                        calcCost(): should be able to caculate the total cost of the carpet and return it as double
                        toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()
            total price of carpet= (width+length)*unitprice
            if the carpet is persian  carpet that's came from Turkey, add 200$ to the totalPrice

     */

    int width;
    int length;
    double unitprice;
    boolean ispersian;

    public void customOrder(int carpwidth,int carplength,double carpunitprice,boolean carpispersian){
        width=carpwidth;
        length=carplength;
        unitprice=carpunitprice;
        ispersian=carpispersian;

    }

    public double calcCost(){
        double totalPrice= (width+length)*unitprice;
        if(ispersian){
            totalPrice+=200;
        }
        return totalPrice;
    }

    public String toString(){
        return "Width of carpet: "+width+" length of carpet: "+length+" Price of carpet: "+unitprice+"Total price: "+calcCost();
    }





}
