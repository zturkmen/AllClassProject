package Resources;

import day39_AccessModifiers.AccessModifiers;
import org.w3c.dom.ls.LSOutput;

public class AccessModifier_Test {
    public static void main(String[] args) {


        AccessModifiers obj = new AccessModifiers();
       // System.out.println(obj.defaultAccess);  // only accessibla sama package
        System.out.println(obj.publicAccess);       // open to the word
       // System.out.println(obj.ssn);  farkli package de oldugu icin ulasamamzsin

    }

}
