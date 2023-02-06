package HW_1_29_2023;

public class Method1 {

    //Create a method that will accept an array as parameters and will return a sum of all elements from that array.
    //Method should be visibly only within same package and accessible by the creating an instance of the class.

    //return type = int
    //parameters = int [] nums
    //tag

    public int arraySum(int[] nums) {
        int sum = 0;

        for (int integers : nums) {
            sum += integers;
        }

        return sum;
    }


    public static void main(String[] args) {

    }
}
