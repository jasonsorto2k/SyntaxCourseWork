package HW_1_24_2023;

import java.sql.SQLOutput;

public class task1 {

    public static void main(String[] args) {

        // 1) Create a String that will hold a sentence.
        // Write a program to get a new String without any spaces.

        String sentence = "I love going to the beach.";

        System.out.println(sentence.replaceAll(" ", ""));

    }
}
