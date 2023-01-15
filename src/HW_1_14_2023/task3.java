package HW_1_14_2023;

import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {

        // 3) Write a program that reads a range of integers (start and end point),
        // provided by a user and then from that range prints the sum of the even and odd integers.

        Scanner J = new Scanner(System.in);
        System.out.println("Please enter two numbers:");

        int num1 = J.nextInt();
        int num2 = J.nextInt();
        int sumE = 0;
        int sumO = 0;

        for (int i = num1; i < num2; i++) {
            if (i % 2 == 0) {
                sumE = sumE + i;
            } else {
                sumO = sumO = i;
            }
        }
        System.out.println("sum of even number " + sumE);
        System.out.println("sum of even number " + sumO);
    }
}
