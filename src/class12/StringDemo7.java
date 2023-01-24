package class12;

public class StringDemo7 {

    public static void main(String[] args) {

        // .startsWith method   .endsIn method

        String str = "I love java";
        boolean startsWith = str.startsWith("I");

        System.out.println(startsWith);

        System.out.println(str.endsWith("java"));

        //Method chaining is when you combine methods

        System.out.println(str.toLowerCase().startsWith("i"));



    }
}
