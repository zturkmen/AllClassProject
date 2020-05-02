package day23_methods;

public class UniqueValues {
    public static void main(String[] args) {
/*
1.  Write a program that can print out the unique values from a String Array
			Ex:
				if arr -> {"A", "A", "B", "C", "C"}
				output: B
				if arr -> {"A", "B", "B", "C"}
				output:  A
						 C
			MUST use for each loop
 */


        String [] arr={"A","B","A"};

       // int count = 0;
        for(String each2:arr) {    // sirayla ayzdiriyor ilkinde
           int count = 0;

            for (String each : arr) {           // sirala burdada yazdiriyor

                if (each.equals(each2)) {       // birbirine esitse count ediyor
                    count++;

                }
            }
            if (count == 1) {                           // when that counts if result just returns 1
                System.out.println(each2);

            }


        }




    }
}
