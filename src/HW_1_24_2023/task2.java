package HW_1_24_2023;

public class task2 {

    public static void main(String[] args) {

        // 2) Create a String that should be combination of letters, numbers and special characters.
        // Find out how many Alphanumeric(abd AZ 284) characters are there in the String.

        String random = "123456asdfghj!@#$%^&";

        System.out.println(random.replace("[^A-Za-z0-9]", "").length());
    }
}

