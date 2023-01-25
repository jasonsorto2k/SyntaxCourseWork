package HW_1_24_2023;

public class task2 {

    public static void main(String[] args) {

        // 2) Create a String that should be combination of letters, numbers and special characters.
        // Find out how many Alphanumeric(abd AZ 284) characters are there in the String.

        String random = "123456asdfghj!@#$%^&";

        int count = 0;
        int countnum = 0;
        System.out.println(random.replaceAll("[^A-Za-z0-9]", "").length());


        for (int i = 0; i < random.length(); i++) {
            if (Character.isAlphabetic(random.charAt(i))) {
                count++;
            }


        }
        System.out.println("The Alphabetic characters in the String are " + count);

        for (int i = 0; i < random.length(); i++) {
            if (Character.isDigit(random.charAt(i))) {
                countnum++;
            }

        }
        System.out.println("The numeric characters in String  are " + countnum);
    }
}

