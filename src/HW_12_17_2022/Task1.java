package HW_12_17_2022;

public class Task1 {
    public static void main(String[] args) {

        /* 1.Create a Java program and name it Double Comparison.
        Declare 2 double values and if value of first variable is higher than the second,
        print “Double value  is larger than  .” Otherwise print...
        */

        double num1 = 3.6;
        double num2 = 7.8;

        if (num1>num2)
        {
            System.out.println("Double value "+num1+" is higher than"+num2);
        }else{
            System.out.println("Double value "+num2+ " is higher than "+num1);
        }
    }
}
