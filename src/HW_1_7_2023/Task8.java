package HW_1_7_2023;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        /*
         Allow user to enter grade and then provide explanation:
         A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
         At the end your program should print which grade was entered by a user with explanation.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your grade:");

        char grade = scan.next().charAt(0);

        switch (grade){

            case 'A':
                System.out.println("Excellent");
                break;

            case 'B':
                System.out.println("Proficient");
                break;
            case 'C':
                System.out.println("OK");
                break;
            case 'D':
                System.out.println("Below Average");
                break;
            default:
                System.out.println("Bad");
                break;

        }

    }
}
