package HW_1_8_2023;

public class Task5 {

    public static void main(String[] args) {

        int oddOne = 20;
        while (oddOne>0){

            if (oddOne%2==0){
                System.out.println(oddOne);
            }
            oddOne--;
        }
        System.out.println("*************************");

        int oddTwo = 20;
        while (oddTwo > 0){
            System.out.println(oddTwo);
            oddTwo-=2;
        }
    }
}
