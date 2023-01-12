package class1;

public class ArithmeticOperators {

    public static void main(String[] args) {

        // Arithmetic Operators are what you use to use mathematics in your code
        // Addition (+), Subtraction (-), Multiplication (*), Division (/)
        // Modulo (%), Increment (++), Decrement (--)
        // Modulo is the REMAINDER OF DIVISION
        // Math follows order of operations P.E.M.D.A.S

        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;

        //Basic Operators +,-,*,/
        System.out.println("a + b = " + (a + b) );
        System.out.println("a - b = " + (a - b) );
        System.out.println("a * b = " + (a * b) );
        System.out.println("b / a = " + (b / a) );
        System.out.println("b % a = " + (b % a) );
        System.out.println("c % a = " + (c % a) );

        //Modulo %
        System.out.println("a++  = " + (a++) );
        System.out.println("a--  = " + (a--) );

        //Increment & Decrement ++,--
        System.out.println("d++  = " + (d++) );
        System.out.println("++d  = " + (++d) );


    }
}
