package class12;

public class StringDemo4 {

    public static void main(String[] args) {

        // is empty method & is blank
        // the difference between is empty and is blank is empty counts spaces,
        // is blank looks for only character and ignores spaces

        String str = "";
        System.out.println(str.isEmpty());

        String str2 = "not empty";
        System.out.println(str2.isEmpty());

        String str3 = "  ";
        System.out.println(str3.isBlank());


    }
}
