package class5;

public class LogicalOperators {
    public static void main(String[] args) {


        /*
        1 2 3 4 5 6 7 8 9 10   15
        */

        System.out.println(!true);
        System.out.println(!false);
        boolean rich = true;
        System.out.println(!rich);

        int number = 9;

        if (number != 1) {
            System.out.println("hello Java");
        } else {
            System.out.println("Hello word");
        }

        String country = "China";

        if (!country.equals("BadCountry")) {
            System.out.println("You are welcome");
        }

        if (country.equals("China")) {
            System.out.println("You are welcome");
        }

        if (country.equals("Nepal")) {
            System.out.println("You are welcome");
        }

        if (country.equals("Pakistan")) {
            System.out.println("You are welcome");

        }
    }
}
