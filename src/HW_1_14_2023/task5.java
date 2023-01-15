package HW_1_14_2023;

public class task5 {

    public static void main(String[] args) {

        /*
        Print the following pattern:
        55555
        4444
        333
        22
        1
        */

        for (int i = 5; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(i);
            }
            System.out.println();
        }

    }
}
