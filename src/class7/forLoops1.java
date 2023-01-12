package class7;

public class forLoops1 {

    public static void main(String[] args) {

        // using a for loop to print odd numbers from 1 to 20

        //when you know exactly how many times you want to execute code use for loop

        for (int i = 0; i < 20; i++) {
            if (i%2!=0){
                System.out.println(i);
            }
        }

        System.out.println("***************");
        for(int i = 1;i <20; i+=2){
            System.out.println(i);
        }
    }
}
