package class9;

public class arraysTask1 {

    public static void main(String[] args) {

        int[] arr = new int[5];

        arr[0] = 45;
        arr[1] = 44;
        arr[2] = 33;
        arr[3] = 20;
        arr[4] = 10;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                sum=sum+arr[i];
            }
        }

        System.out.println("Sum of elements at even indexes: " + sum);
        System.out.println();
    }
}





