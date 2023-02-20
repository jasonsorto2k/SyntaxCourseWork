package class27;

import java.util.ArrayList;

public class AdvancedMethodPractice {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Fizzy");
        names.add("Savo");
        names.add("Sam");
        names.add("Urwa");
        names.add("Tarik");
        names.add("Abeera");

        System.out.println(names.contains("Daria"));
        System.out.println(names.get(3));
        System.out.println(names.indexOf("Tarik"));             //Examples of methods in ArrayList Class
        System.out.println(names.isEmpty());

        names.remove("Sam");
        System.out.println(names);

        names.set(3, "Jason");
        System.out.println(names);
    }
}
