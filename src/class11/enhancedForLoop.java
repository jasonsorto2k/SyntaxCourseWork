package class11;

public class enhancedForLoop {

    public static void main(String[] args) {

        int[][] matrix = {{10, 20, 30},
                {45, 55, 66},
                {30, 40, 20, 10, 25}
        };
        // foreach loops to print all elements in 2D array
        for(int[] arr:matrix){

            for(int number:arr){
                System.out.println(number+" ");
            }
            System.out.println();
        }



    }
}




