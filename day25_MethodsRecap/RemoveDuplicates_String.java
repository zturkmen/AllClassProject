package day25_MethodsRecap;

public class RemoveDuplicates_String {
    public static void main(String[] args) {
        String str = "ABAB";
        String result = "";                             // diger cozumu newWarmUp classda day 24

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);  //ABAB     // result char
            if (!result.contains("" + ch)) {        // normalde sonuc char di ama biz "" ekleyip string yaptik cunku contains sadece string kabul ediyor
                result += ch;                     // aslinds tek tek cek ediyor eger char olarak harf varsa ve if lede o nun tersini ekliyor
            }                                    // result+= demek ch deki olmayanlari ekliyor reusltuma
        }
        System.out.println(result);
        String str2="ABCABCABC";
        String result2=RemoveDuplicates(str2);

    }

        public static String RemoveDuplicates(String str){
            String result="";
            for(int i=0; i<str.length(); i++){
                char ch=str.charAt(i);
                if(!result.contains(""+ch)){
                    result+=ch;
                }
        }
            return result;


    }
}
