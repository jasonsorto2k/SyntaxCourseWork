package class13;

public class StringMethodsRecap {

    public static void main(String[] args) {

        //charAt // how can I print thew letters from string one by one
        String str = "Java is great";
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
        //what is the input to the charAt() method; method is int output is char

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                count++;
            }
        }

        System.out.print("Letter a has appeared " + count + " times.");

    }
}
