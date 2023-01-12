package HW_12_18_2022;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        /*
        You are DMV representative, and you need to ask customer their age.
        If they are 18 and older you will issue a driver licence to them,
        otherwise you will offer them to get a learners permit.
         */

        Scanner input = new Scanner (System.in);
        System.out.println("Please enter your age here ---->");

        int age = input.nextInt();

        if (age>=18){
            System.out.println("Congratulations! You are able to obtain your Driver's License!");
        }else {
            System.out.println("Congratulations! You ae able to obtain your Learner's Permit");
        }
    }
}
