package REPLITZ;

import java.util.Arrays;
import java.util.Scanner;

public class zeroSevenSeven {

    public static void main(String[] args) {

        // Create an array of integers that will store 5 elements taken from a user
        //Don't print any prompt message for the user
        //Then print out all the elements you have created in the first loop in reverse order.

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 5 digits-");

        int num [] = new int[5];

        for (int i = scan.nextInt()-1; i < num.length; i--) {
            num[i]=scan.nextInt();

        }
        System.out.println(Arrays.toString(num));

    }
}
