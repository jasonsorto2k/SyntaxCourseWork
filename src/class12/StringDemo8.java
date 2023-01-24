package class12;

public class StringDemo8 {

    public static void main(String[] args) {

        // Method gives individual characters in string
        //                .charAt

        String str = "java is love";
        char character = str.charAt(5);
        System.out.println(character);

        System.out.println("----------------");

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));

        }
        System.out.println("----------------");

        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a'){
                counter++;
            }
        }

        System.out.println(counter);


    }
}
