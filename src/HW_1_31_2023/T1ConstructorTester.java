package HW_1_31_2023;

public class T1ConstructorTester {

    public static void main(String[] args) {

        // 1) Write a java class that will have a constructor: one with parameters and second without any parameters.
        // Create a separate Test class where you will execute both of the constructors 1 by 1.

        T1Constuctor Loki = new T1Constuctor("Loki","Medium Hair Domestic","Grey, Black & White",4,20.4);
        Loki.printInfo();

        T1Constuctor Pebbles = new T1Constuctor();
        Pebbles.printInfo();

    }
}
