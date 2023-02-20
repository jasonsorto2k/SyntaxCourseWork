package class28;

import java.util.ArrayList;

public class demo1 {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("Cat");
        words.add("Java");
        words.add("Computer");
        words.add("Lava");
        words.add("apple");

        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).endsWith("a")) {
                words.remove(i);

            }
        }

        System.out.println(words);
    }

}

