package REPLITZ;

import java.util.Scanner;

public class zeroSevenSix {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] days = new String[7];

        System.out.println("Please enter day 1 of the week");
        days[0] = scan.next();
        System.out.println("Please enter day 2 of the week");
        days[1] = scan.next();
        System.out.println("Please enter day 3 day of the week");
        days[2] = scan.next();
        System.out.println("Please enter day 4 of the week");
        days[3] = scan.next();
        System.out.println("Please enter day 5 of the week");
        days[4] = scan.next();
        System.out.println("Please enter day 6  day of the week");
        days[5] = scan.next();
        System.out.println("Please enter day 7  of the week");
        days[6] = scan.next();

        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);

        }


    }
}
