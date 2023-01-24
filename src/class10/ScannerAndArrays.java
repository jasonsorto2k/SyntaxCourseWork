package class10;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerAndArrays {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 5 numbers");

        int[] num = new int[5];

        // below code is how you manually store values in array list

        /*
        num[0]=40;
        num[1]=50;
        num[2]=60;
        num[3]=70;
        num[4]=80;
        */

        //Below code is using scanner in arrays, good but lots of code

        /*
        num[0]=scan.nextInt();
        num[1]=scan.nextInt();
        num[2]=scan.nextInt();
        num[3]=scan.nextInt();
        num[4]=scan.nextInt();
         */

        // below code uses normal for loop to ask the user of numbers and store in array
        for (int i = 0; i < num.length; i++) {
            num[i]=scan.nextInt();
        }

        System.out.println(Arrays.toString(num));

    }
}
