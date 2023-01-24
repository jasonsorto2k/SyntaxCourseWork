package REPLITZ;

import java.util.Scanner;

public class zeroTwoSeven {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your age");

        int age = scan.nextInt();

        if (age>18){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }
    }
}
