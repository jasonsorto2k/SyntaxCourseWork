package class4;

public class ifDemo1 {
    public static void main(String[] args) {

        int money = 1500;

        if (money > 1000) {
            System.out.println("Lets buy an iPhone!");
        }
        if (money > 2000) {
            System.out.println("Lets buy a macbook");
        }

        boolean mothersDay = true;

        if (mothersDay) {
            System.out.println("Happy Mother's Day");
        }

        String name = "Sardar";

        if (name.equals("Sardar")) {  //Integrating String with if method
            System.out.println("I love football");
        }


    }
}
