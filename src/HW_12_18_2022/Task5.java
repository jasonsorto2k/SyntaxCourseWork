package HW_12_18_2022;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        /*
        Create a Java program that will ask user to input city and temperature.
        Your program should convert Fahrenheit into Celsius and print “The temperature is the city  is..."
         */

        Scanner one = new Scanner (System.in);
        System.out.println("Please enter the name of your city:");

        String city = one.nextLine();

        Scanner two = new Scanner (System.in);
        System.out.println("Please input the current temperature:");

        int temp = two.nextInt();
        int temp1 = (temp-32)*5/9;

        System.out.println("The temperature of the city "+(city)+ ", is "+(temp1)+ " degrees celsius!");



    }
}
