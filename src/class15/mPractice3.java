package class15;

public class mPractice3 {

    // Create a method that takes an array of int values
    // , sum all the elements from the array and return the sum

    // return type = int
    // method name = arraySum
    // parameters = integer array (int[]arr)

    int arraySum (int[] collection){

        int sum = 0;
        for(int num:collection){
            sum+=num;
        }
        return sum;
    }
}
