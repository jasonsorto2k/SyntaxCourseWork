package HW_1_7_2023;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        /*
        4)Write a program for user to enter his/hers birth month. Based on the month define the season.
        Example: if user is born in June, July or August → season = Summer.
        At the end of the program we should see output as “You were born __”.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your birth-month--->");

        String birth_month = scan.next();

        if (birth_month.equalsIgnoreCase("March") || birth_month.equalsIgnoreCase("April") || birth_month.equalsIgnoreCase("May")){
            System.out.println("You were born in the Spring!");
        } else if (birth_month.equalsIgnoreCase("June") || birth_month.equalsIgnoreCase("July") || birth_month.equalsIgnoreCase("August")){
            System.out.println("You were born in the Summer!");
        } else if (birth_month.equalsIgnoreCase("September") || birth_month.equalsIgnoreCase("October") || birth_month.equalsIgnoreCase("November")){
            System.out.println("You were born in Autumn!");
        } else if (birth_month.equalsIgnoreCase("December") || birth_month.equalsIgnoreCase("January") || birth_month.equalsIgnoreCase("February")){
            System.out.println("You were born in the Winter!");
        } else{
            System.out.println("Please enter a valid month!!!");
        }

    }
}

