package HW_1_7_2023;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        /*
        5) Write a program to find largest of three double values using if-else...if
        and logical operators provided by a user (numbers must be distinct)
         */

        Scanner scan = new Scanner(System.in);

        double num1 , num2, num3;
        System.out.println("Please enter three numbers--->");

        num1 = scan.nextDouble();
        num2 = scan.nextDouble();
        num3 = scan.nextDouble();

        if (num1>num2 && num1>num3){
            System.out.println("The largest number is "+num1);
        }else if (num2>num1 && num2>num3){
            System.out.println("The largest number is "+num2);
        }else if (num3>num1 && num3>num2){
            System.out.println("The largest number is "+num3);
        }
    }
}
