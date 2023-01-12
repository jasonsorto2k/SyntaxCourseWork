package class6;

public class switchCase {
    public static void main(String[] args) {

        String country = "Italy";

        System.out.println (country.toLowerCase());

        // converts the text to lowercase USA=>usa
        switch (country.toLowerCase()) {
            case "usa":
                System.out.println("Burgers");
                break;
            case "Italy":
                System.out.println("Pasta");
                break;
            case "afganistan":
                System.out.println("Kebab");
                break;
            default:
                System.out.println("Wrong country");
                break;
        }
    }
}
