package class12;

public class StringDemo9 {

    public static void main(String[] args) {

        //.isAlphabetic distinguishes letters in string

        String str = "jascdfsavfr 3456435";

        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            if(Character.isAlphabetic(str.charAt(i))){
                counter++;
            }
        }

        System.out.println("Total alphabetical elements in string is "+counter);


    }
}
