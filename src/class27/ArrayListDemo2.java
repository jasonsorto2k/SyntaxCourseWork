package class27;

import java.util.ArrayList;

public class ArrayListDemo2 {

    public static void main(String[] args) {

        // Array list does not support primitive data types ig. int, double, boolean
        // only supports classes/objects

        // int => integer
        // byte => Byte
        // boolean => Boolean               // lowercase to uppercase first letter
        // float => Float                   // int and char are the only exceptions
        // double => Double
        // char => Character
        // long => Long

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(15);
        numbers.add(20);
        numbers.add(45);
        numbers.add(150);
        numbers.add(200);
        numbers.add(56);

        System.out.println(numbers);


    }
}
