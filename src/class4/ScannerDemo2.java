package class4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerDemo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Please input your age: ");

        int age = input.nextInt();
        System.out.println("You are "+age+" years old!");
    }
}
