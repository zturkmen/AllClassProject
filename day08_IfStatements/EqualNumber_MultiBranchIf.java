package day08_IfStatements;

public class EqualNumber_MultiBranchIf {
    public static void main(String[] args) {
        /*1.  write a program that can check the equality of the three given numberrs
        declare 3 numbers n1, n2, n3
        if n1 and n2 are equal  => n1&n2 are equal
        if n2 and n3 are equal ==> n2&n3 are equal
        if n3 and n1 are equal ==>n3&n1 are equal
        if all equal ==> all equal
        if none of them are euqal ==> none of them are equal

                */
        double n1 = 100.5;
        double n2 = 200.5;
        double n3 = 300.5;

        boolean n1Equaln2 = n1==n2 && n1 != n3;
        boolean n1Equaln3 = n1 == n3 && n1 != n2;
        boolean n2Equaln3 = n2 == n3 && n2 != n1;

        boolean allEqual = n1 == n2 && n1 ==n3 ;

        if(n1Equaln2){
            System.out.println("n1 is equal to n2");
        } else if(n1Equaln3){
            System.out.println("n1 is equal to n3");
        } else if(n2Equaln3){

        }else if(allEqual){
            System.out.println("n1 is equal to n2 and n3");
        } else{
            System.out.println("None of them are equal");
        }



    }
}
