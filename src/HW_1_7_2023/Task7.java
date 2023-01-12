package HW_1_7_2023;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        /*
        Ask user to enter their country and capture it. Once values are captured print which language user speaks.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your country:");

        String country = scan.next();

        switch (country) {

            case "USA":
                System.out.println("English");
                break;

            case "Argentina":
                System.out.println("Spanish");
                break;

            case "Germany":
                System.out.println("German");
                break;
        }
    }
}
