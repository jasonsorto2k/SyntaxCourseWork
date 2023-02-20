package class27;

import java.util.ArrayList;

public class ArrayListDemo3 {

    public static void main(String[] args) {

        ArrayList<Character> characters = new ArrayList<>();

        characters.add('A');
        characters.add('B');
        characters.add('C');
        characters.add('D');
        characters.add('E');
        characters.add('F');

        // Enhanced for loops Syntax
        // (Data Type - name : name of array) {B O D Y   O F   C O D E }

        for (Character Alphabet : characters) {
            System.out.print(Alphabet+" ");

        }
    }
}
