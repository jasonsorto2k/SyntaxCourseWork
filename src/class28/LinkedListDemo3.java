package class28;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo3 {

    public static void main(String[] args) {

        // difference between ArrayList and LinkedList
        // Class name is different,

        //linkedlist => 160ms
        //Arraylist => 68063ms

        long startTime = System.currentTimeMillis();

        LinkedList<String> numbers = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            numbers.add(0,"Test Data");

        }

        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime+"ms");







    }
}
