package class6;

public class WhileLoop2 {
    public static void main(String[] args) {

        //why loops are needed. If you were asked to write multiple lines of codes...you could s.o.u.t everything
        //that's not scale-able. Loops help us repeat code for us

        /*
        int number = 1;
        if(number<3){
            System.out.println("hello world");
         */


        int number = 1;
        int sum = 0;
        while (number<10){
            sum=sum+number;
            number++;
            System.out.println(sum);

        }






    }
}

