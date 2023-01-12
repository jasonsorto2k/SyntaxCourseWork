package class5;

import java.sql.SQLOutput;

public class LogicalOperators2 {
    public static void main(String[] args) {

        double mathScore = 92.5;
        double historyScore = 91.5;
        double ScienceScore = 93.5;

                if (mathScore >= 90 && historyScore >= 90 && ScienceScore >= 90){
            System.out.println("Brilliant Student!");
        }else{
            System.out.println("You need to work harder!");
        }
    }
}
