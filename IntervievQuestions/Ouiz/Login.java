package IntervievQuestions.Ouiz;

 class credentials {
    private String Username="Hayri Engin";
    private String Password="CyberTek123";

    private String getUsername(){
        return Username;
    }
    private String getPassword(){
        return Password;
    }
}
public class Login{
    public static void main(String[] args) {

        credentials obj=new credentials();
       // System.out.println(obj.getUsername);
       // System.out.println(obj.getPassword);


        // Answer is compiler fails at Login
        // cunku private methodu baska class dan cagiramazsin


    }
}