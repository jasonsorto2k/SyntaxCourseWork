package REPLITZ;

import java.util.Scanner;

public class zeroTwoTwo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = scan.next();
        System.out.println("Enter your mobile number");
        long mobile = scan.nextLong();
        System.out.println("Enter your age");
        int age = scan.nextInt();

        System.out.println("Your name is "+name+", your age is "+age+" your mobile number is 123-456-7890");

    }
}
