package day44_Exceptions;
/*
warmup task:
    1. create a class called Browsers
            actions: openBrowser():prints "opens the default browser"
                     closeBrowser(): closes the default browser
    2. create a class called ChromeBrowser
            actions: openBrowser(): opens the chrome browser
                     closeBrowser(): closes the chrome browser
    3. creata a class called FirefoxBrowser
            actions: openBrowser(): opens the Firefox browser
                     closeBrowser(): closes the Firefox browser
    4. create a class called Opera browser
            actions: openBrowser(): opens the Opera browser
                     closeBrowser(): closes the Opera browser
    5. create a class called Test:
            create an object of each browsers and call the openBrowser & closeBrowser actions
 */

public class Browsers {

    protected void openBrowser(){
        System.out.println("opening the default browser");
    }

    protected void closeBrowser(){
        System.out.println("closing the default browser");
    }

}

class ChromeBrowser extends Browsers{
// inherited
    // openbrowser and closebrowser already in super class
    // return time must to be same in overriding
    @Override          //annotation
    public void openBrowser(){               // different implementetion

        System.out.println("Opening the chrome browser");
    }
    @Override
    public void closeBrowser(){
        System.out.println("closing the chrome browser");
    }

}

class FirefoxBrowser extends Browsers{
    @Override          //annotation
    public void openBrowser(){               // different implementetion

        System.out.println("Opening the chrome firefoxBrowser");
    }
    @Override
    public void closeBrowser(){
        System.out.println("closing the chrome firefoxBrowser");
    }


}

class Test{
    public static void main(String[] args) {
        ChromeBrowser obj=new ChromeBrowser();
        obj.openBrowser();
        obj.closeBrowser();

        System.out.println("==================================");
        FirefoxBrowser obj1=new FirefoxBrowser();
        obj1.openBrowser();
        obj1.closeBrowser();

    }
}
