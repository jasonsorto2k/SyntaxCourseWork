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

        int [] nums = new int[5];

         nums[0] = scan.nextInt();
         nums[1] = scan.nextInt();
         nums[2] = scan.nextInt();
         nums[3] = scan.nextInt();
         nums[4] = scan.nextInt();

        for (int i = 1; i < nums.length; i++) {
            System.out.println(nums[i]);

        }



        }


    }

