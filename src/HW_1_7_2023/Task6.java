package HW_1_7_2023;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        /*
        Write a program to find the largest number among
        three numbers using nested if provided by a user
        (numbers must be distinct)
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter three numbers:");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if (num1>num2){
            if (num1>num3){
                System.out.println("The largest number is " +num1);
            }
        }
        if (num2>num1){
            if(num2>num3){
                System.out.println("The largest number is " +num2);
            }
        }
        if(num3>num1){
            if(num3>num2){
                System.out.println("The largest number is " +num3);
            }
        }
    }
}
