package HW_12_18_2022;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        /*
        Write a program to ask user to enter numbers of worked years and annual salary.
        If user worked for more or equals to 5 years than user is eligible for the bonus, otherwise he is not.
        Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.
         */

        Scanner one = new Scanner(System.in);
        System.out.println("Please input number of worked years:");

        int years = one.nextInt();

        if (years >= 5) {
            System.out.println("Congratulations! You are eligible for a bonus!");
            System.out.println("Please input your annual salary:");

            int salary = one.nextInt();

            if (salary > 50000) {
                System.out.println("Your bonus will be 5000 dollars!");
            } else {
                System.out.println("Your bonus will be 3000!");
            }
        } else {
            System.out.println("Sorry :( you are not eligible for a bonus.");
        }
    }
}
