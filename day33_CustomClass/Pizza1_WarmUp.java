package day33_CustomClass;

public class Pizza1_WarmUp {
    /*
    1. create a custom class for pizza that should contain the following:
                instance variables:
                        size (either small, medium, large)
                        number of cheese topping
                        number of pepperoni toppings
                instance method:
                        customizeOrder(): allows user to set the size and toppisngs of the pizza
                        calcCost(): returns the total cost as double
                        toString(): a String return method that's containing the pizza' size, quantity of each topping, and the pizza cost as calculated by calcCost()
                Pizza cost is determined by:
                        Small: $10 + $1.5 per pepperoni topping + 1 per cheese topping
                        Medium: $12 + $1.5 per pepperoni topping + 1 per cheese topping
                        Large: $14 + $1.5 per pepperoni topping + 1 per cheese topping

     */

    String size;
    int CheeseTopping;
    int PepTopping;


    public void customizeOrder(String sizing,int cheese,int pepperoni){

        size=sizing;
        CheeseTopping=cheese;
        PepTopping=pepperoni;

    }
    public Double calcCost(){
        double cost;
        if(size.equals("small")){
           cost=10+1.5*PepTopping +1*CheeseTopping;
        }else if(size.equals("Medium")){
            cost=12+1.5*PepTopping+1*CheeseTopping;
        }else{
            cost=14+1.5*PepTopping+1*CheeseTopping;
        }

        return cost;
    }
    public String toString(){
        return "Pizza, "+size+" Cheese, "+CheeseTopping+" Pepperoni, "+PepTopping+" Pizza cost, "+calcCost();
    }


}
