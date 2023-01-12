package HW_1_7_2023;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        /*
        3) Write a program that will read three inputs of scores
        (quiz, midterm, and final scores)
        and determine the grade based on the following rules:
        if the average score >=90 → grade=A
        if the average score >= 70 and <90 → grade=B
        if the average score>=50 and <70 → grade=C
        if the average score<50 → grade=F
         */

        Scanner score = new Scanner(System.in);


        System.out.println("Please enter your quiz score:");
        int quiz = score.nextInt();

        System.out.println("Please enter your midterm score:");
        int midterm = score.nextInt();

        System.out.println("Please enter your Finals score:");
        int finals = score.nextInt();

        int average = (quiz + midterm + finals) / 3;

        if (average >= 90) {
            System.out.println("Your grade is an A!");
        }
        else if (average >= 70 && average < 90) {
            System.out.println("Your grade is a B!");
        }
        else if (average >= 50 && average < 70) {
            System.out.println("Your grade is a C.");
        }
        else if (average < 50) {
            System.out.println("Your grade is an F!");

        }else{
            System.out.println("Please enter valid scores!");
        }
    }
}

