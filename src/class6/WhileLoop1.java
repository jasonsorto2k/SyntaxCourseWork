package class6;

public class WhileLoop1 {
    public static void main(String[] args) {

        //why loops are needed. If you were asked to write multiple lines of codes...you could s.o.u.t everything
        //that's not scale-able. Loops help us repeat code for us

        /*
        int number = 1;
        if(number<3){
            System.out.println("hello world");
         */

        int number =1;
        while (number<5){
            System.out.println(number);
            number++;
        }
        System.out.println("*******************");

        int number2 = 0;
        while (number2<10){
            System.out.println(number2);
            number2+=2;
        }
        System.out.println("********************");



    }
}

