package class27;

public class Demo2 {

    public static void main(String[] args) {
        String name = "Laura";
        String[] names = {"Hiral", "Nima", "Laura", "Nat"};
        System.out.println(searchName(names,name));







    }

    public static boolean searchName(String[] names, String searchName) {
        for (String name : names) {
            if (name.equals(searchName)) {
                return true;
            }
        }
        return false;
    }

}
