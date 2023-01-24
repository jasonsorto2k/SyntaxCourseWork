package class10;

public class arraysDemo {

    public static void main(String[] args) {

        int[] num = {10,20,30,40,50};

        System.out.println(num[4]);

        System.out.println("__________________");


        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

        System.out.println("__________________");


        for (int enhanced: num) {                     //              SYNTAX FOR ENHANCED FOR LOOPS
            System.out.println(enhanced);             //  for ( Data type  Variable name : array name) { body...}
        }                                             //   whenever possible use the enhanced for loop, cleaner

    }
}
