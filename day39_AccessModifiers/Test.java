package day39_AccessModifiers;

public class Test {
    public static void main(String[] args) {
        AccessModifiers obj=new AccessModifiers();
        System.out.println(obj.defaultAccess);            // erisim var cunku ikiside ayni package de
        System.out.println(obj.publicAccess);
        //System.out.println(obj.ssn);     sadece ayni class da ulasim var  // private only accessible within the same class
    }



}
