package REPLITZ;

public class zeroSevenNine {

    public static void main(String[] args) {

        double[][] twoDArray = {{1.4, 2.0, 3.3, 2.0},
                                {4.0, 1.5, 6.1, 1.0},
                                {1.2, 3.1, 4.0, 1.6}
        };

        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray.length+1; j++) {
                for (int p = 0; p < twoDArray.length; p++) {

                }
                System.out.print(twoDArray[i][j]+" ");

            }
            System.out.println();

        }
    }
}
