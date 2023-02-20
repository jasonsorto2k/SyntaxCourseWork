package class10;

public class twoDimensionalArrays {

    public static void main(String[] args) {



        String[][] thomsonTrain = new String [3][3];                         //          SYNTAX FOR 2D ARRAYS
                                                                             //         (Double square brackets)
                                                                             //                 [][]

        String[] cabin0 = {"Adam","Sadie","Jason","Javier"};
        String[] cabin1 = {"jorge","Josh","Jasper","nate"};
        String[] cabin2 = {"Amber","jack","chris","rudy"};

        thomsonTrain[0]=cabin0;
        thomsonTrain[1]=cabin1;
        thomsonTrain[2]=cabin2;

        System.out.println(thomsonTrain[2][3]);
        


    }
}
