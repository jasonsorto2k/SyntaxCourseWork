package class12;

public class StringDemo {

    public static void main(String[] args) {

        //                              ----INTERVIEW ALERT----
        //          String class is the most important class because it is widely used.

        //Creating an object of the String class
        String strObj = new String();

        //Another way of creating an object of String class "shorter way"
        //This is the usual way of making the object
        //               ^^^^^^^^^^
        String stjObj2="Java";

        System.out.println(stjObj2.length());

        String str="banana ";
        int len = str.length();
        System.out.println(len);

        String name = "Jason Antonio Sorto";
        if (name.length()>10){
            System.out.println("Name can't be more than 10 characters");


        }






    }
}
