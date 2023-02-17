package REPLITZ;

public class zeroEightOne {

    public static void main(String[] args) {

        int[] array = {5, 4, 8};

        if (array[0] > array[1] && array[0] > array[2]) {
            System.out.println(array[1]);
        } else if (array[1] > array[0] && array[1] > array[2]) {
            System.out.println(array[2]);
        } else {
            System.out.println(array[2]);
        }
    }
}



