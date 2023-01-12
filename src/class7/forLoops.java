package class7;

public class forLoops {

    public static void main(String[] args) {
        /*
        prints number from 0 to 9           WHILE LOOPS
         */

        int number = 0; //creating a variable of type int
        while (number < 10) { //checks the condition, if condition is true is executed in body of while loop
            System.out.println(number);//prints the vale of number on the console
            number++;//it adds one to the number variable every loop
        }

        System.out.println("*********************************");
        /*
        (initialize; condition; increment or decrement)          FOR LOOPS
         */

        for (int i = 0; i < 10; i++) {
            System.out.println(i);

            System.out.println("********************************");
            // using a for loop, print odd number s from 1 to 20

            for (int x = 1; x < 20; x++) {
                if (i % 2 != 0) {
                    System.out.println(x);
                }
                System.out.println(i);
            }
        }
    }
}
