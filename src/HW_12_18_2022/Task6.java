package HW_12_18_2022;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        /*
        Create a Java program that will ask if user has a credit card or not.
        If you user does not have a credit card then offer them.
        If they do have one ask what is balance on the card?
        If balance of the card is larger than 1000, tell them to pay off immediately,
        otherwise you can tell them that they can spend more.
         */

        Scanner one = new Scanner(System.in);
        System.out.println("You currently have a credit card - True or false?:");

        Boolean credit = true;
        credit = one.nextBoolean();

        if (credit){
            System.out.println("What is your current balance?");

            int balance = one.nextInt();

            if(balance>=1000){
                System.out.println("Pay off debt immediately!");
            }else{
                System.out.println("Feel free to spend a bit more!");
            }
        }else{
        System.out.println("Would you like to apply for one today?");


    }
}
}
