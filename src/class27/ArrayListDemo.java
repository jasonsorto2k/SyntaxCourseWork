package class27;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        // Syntax for ArrayList
        // Call on class - <Data Type> - name = new ArrayList();
        // <> diamond operator and angle brackets

        // We have created an arraylist of strings
        ArrayList<String> names = new ArrayList<>();
        // Using the add method to add elements

        names.add("Jason");
        names.add("Jasmin");
        names.add("Javier");
        names.add("Jessica");
        names.add("Francisco");
        names.add("Sonia");

        System.out.println(names);


    }
}
