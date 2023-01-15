package HW_1_14_2023;

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {

        // 2) Create a program that will be asking user to apply for a credit card 10 times.
        // as soon you get an “yes” from a user program should stop asking.

        Scanner J = new Scanner(System.in);
        System.out.println("Would you like to apply for a credit card?(True or false):");
        boolean creditCard = J.nextBoolean();

        for(int i = 0; i <= 10; i++){
            while(!creditCard){
                System.out.println("Would you like to apply for a credit card");
                creditCard = J.nextBoolean();
                break;
            }
        }
    }
}








