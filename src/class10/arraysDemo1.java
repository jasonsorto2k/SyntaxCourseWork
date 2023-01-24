package class10;

public class arraysDemo1 {

    public static void main(String[] args) {

        String[] name = {"Jason","Jess","Javi","Jasmin"};

        System.out.println(name[2]);

        System.out.println("__________________");


        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }

        System.out.println("__________________");


        for (String enhanced: name) {                     //              SYNTAX FOR ENHANCED FOR LOOPS
            System.out.println(enhanced);             //  for ( Data type  Variable name : array name) { body...}
        }                                             //   whenever possible use the enhanced for loop, cleaner

    }
}
