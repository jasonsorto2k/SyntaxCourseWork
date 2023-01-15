package HW_1_14_2023;

import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {

        // 4) Write a program to ask a user to enter item they want to buy and the price of that item.
        // Every time user enters money accumulate the amount and tell the user how much is left to pay off.
        // If user give more money program should return a change. Whenever a user done with payments program should say
        // "Thank you for shopping!"

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the item you want to buy:");
        String item = scan.next();

        System.out.println("Please enter price of item:");

        float price = scan.nextFloat();
        float pay = 0;
        float total = 0;

        while (total < price){
            System.out.println("Please pay your remaining balance of $"+(price-total));
            pay = scan.nextFloat();
            total=total+pay;

            if(total>price){
                System.out.println("You will be reimbursed $"+(total-price));
            }
        }
        System.out.println("Thank you for shopping :)");

    }
}
