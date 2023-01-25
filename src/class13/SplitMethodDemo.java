package class13;

public class SplitMethodDemo {

    public static void main(String[] args) {

        String str = "I like java! I write a lot of code daily. I am from batch 15, I think?";

        // this method breaks down complete paragraph into an array of sentences/strings

        String [] strArr = str.split("[.?!]");
        System.out.println(strArr.length);
        System.out.println(strArr[0]);
        System.out.println(strArr[1].trim());
        System.out.println(strArr[2].trim());

        // whenever we are working with arrays we use the length (no parenthesis) and whenever we are
        // working with strings we use the length().
    }
}

