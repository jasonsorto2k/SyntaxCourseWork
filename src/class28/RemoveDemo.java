package class28;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveDemo {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("Cat");
        words.add("Java");
        words.add("Computer");
        words.add("Lava");
        words.add("Data");


        // printing out words that don't end with 'a'
/*
        Iterator<String> iterator = words.iterator();

        while(iterator.hasNext()){
            String s = iterator.next();

            if(s.endsWith("a")){
                iterator.remove();
            }

        }
        System.out.println(words);
 */
        //does not work in java 7
        words.removeIf(s -> s.endsWith("a"));
        System.out.println(words);



    }
}
