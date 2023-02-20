package class27;

public class Demo1 {

    public static void main(String[] args) {

        String name = "Zafar";
        String name2 = "Aiperi";
        String name3 = "Sarah";

        String[] names = {"Hiral", "Nima", "Laura", "Nat"};
        //displayName(names);
        displayName2(name,name2,name3);

    }

    public static void displayName(String[] names) {

        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void displayName2(String name, String name2, String name3) {
        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);
    }


}
