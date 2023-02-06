package class15;

public class mPractice4 {

    int largerNumber(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {

        mPractice4 mp4 = new mPractice4();
        System.out.println(mp4.largerNumber(12,13));
    }


}
