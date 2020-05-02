package day26_MethodOverloading;

public class calisma {
    public static void main(String[] args) {
        String [] some_array={"a","foo","bar","foo","bla"};
        String some_string="foo";
        int count1=count_appearance(some_array,some_string);
        System.out.println(count1);
}




    public static int  count_appearance(String[] arr, String t){
      //  String [] some_array={"a","foo","bar","foo","bla"};
      //  String some_string="foo";

        int count=0;
        for(int i=0;i<arr.length;i++){

            if (arr[i].equalsIgnoreCase(t)) {
                    count++;
                }




        }

       return count;
    }



}
