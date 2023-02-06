package HW_1_29_2023;

public class Method2 {

    // Create a method that will take a String as a parameter and returns reversed String.
    // Method should be available to all classes within your project and accessible by class name.

    public String reverseStr(String input) {
        return new StringBuilder(input).reverse().toString();
    }


    public static void main(String[] args) {

        Method2 m2 = new Method2();
        System.out.println(m2.reverseStr("monday"));


    }



}



