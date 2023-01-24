package class9;

public class arraysDemo {

    public static void main(String[] args) {

        String name = "Slava";
        String name1 = "Jess";
        String name2 = "Jason";
        String name3 = "Nabi";
        String name4 = "Anees";

        String[] names = {"Slava", "Safi", "Jason", "Jenissica", "Aneesa", "Joseph"};

        System.out.println(name2);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[5]);

        // System.out.println(names[500]); error because there is no name on index number 500
        // System.out.println(names[-5]); error because index can't be negative
        // write a loop to print all the names from array

        for (int i = 0; i <= 5; i++) {
            System.out.println(names[i]);

        }
    }
}


