package day41_Inheritance;

public class Ebook extends Book{
    /*
    title  inherited
    author inherited
    price inherited
    toString inherited   this is method
    size    declared
    pages    declared
    readbook()     method ve action olarak ekliceksin
     */

    public String size;
    public int pages;
    public void readbook(){
        System.out.println("reading "+title);
    }




}
