package REPLITZ;

import java.util.Scanner;

public class zeroTwoTwo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        System.out.println("Enter your mobile number");
        System.out.println("Enter your age");
        String name = scan.nextLine();
        String number = scan.nextLine();
        int age = scan.nextInt();
        System.out.println("Your name is " + name + ", your age is " + age + " your mobile number is "+number);


    }
}