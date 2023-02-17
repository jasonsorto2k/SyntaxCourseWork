package class14;

public class ArrayAddMachine {

        static void addArrayElementsMachine ( int[] arr){
            int sum = 0;
            for (int i = 0, arrLength = arr.length; i < arrLength; i++) {
                int number = arr[i];
                sum += number;
            }
            System.out.println(sum);
        }
        public static void main (String[]args){
            int[] array2 = {10, 10, 10, 20, 30};
            addArrayElementsMachine(array2);
            int[] array3 = {20, 20, 40, 40};
            addArrayElementsMachine(array3);


        }


    }



