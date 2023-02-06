package HW_1_29_2023;

public class Method3 {

    // Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    // Method should be available inside the class only where it was declared and executed by calling it is name.

    private static String getOnlyVowels(String inputStr){

        return inputStr.replaceAll("[AEIOUYaeiouy]","");
    }

    public static void main(String[] args) {

        System.out.println(getOnlyVowels("Jason Antonio Sorto"));

    }



}
