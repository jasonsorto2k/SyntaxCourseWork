package class8;

public class ContinuedKeywordDemo1 {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            if (i==3||i==8||i==10) {
                continue;
            } else {
                System.out.println(i);
            }
            System.out.println("hello java");
        }
    }
}
