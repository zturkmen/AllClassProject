package day14_StringClass;

public class practice {
    public static void main(String[] args) {
        String gmail="cybertekschool@gmail.com";

        String userinputGmail="CybertekSchool@gmail.com";

        boolean result= gmail.equals(userinputGmail);  //false

        if(result){
            System.out.println("Logged in");

        }


        System.out.println("=================================================================");
        /*
        valid password must contain a special characters such as(!,-,$)
        valid password should not contain spaces
         */

        String PassWord="mmasd 1235";
        if(PassWord.contains(" ")){
            System.out.println("Password cannot have space in it");
        }else{
            System.out.println("valid password");
        }
        System.out.println("============================================================");

        /*
        every website has "www." at the beginning of the web address
         */

        String webAddress= "amazwww.on.com";
        if(webAddress.contains("www.")){     //true
            System.out.println("valid");
        }

        if(webAddress.startsWith("www.")){    //false
            System.out.println("valid");
        }
          /*
          every single gmail address ends with @gmail.com
           */

          String email="CybertekSchool@Yahoo.com";

          if(email.endsWith("@gmail.com")){
              System.out.println("valid Gmail");
          }else{
              System.out.println("invalid gmail");
          }

/*
        write a program that can validate if a web address is valid
            valid web address:
                    MUST start with www.
                    Must ends with  .com, or .edu, or .net,  or .Gov
         */






    }
}
