package class28;

import java.util.ArrayList;

public class BoxingDemo {

    public static void main(String[] args) {

        Integer integer = new Integer(10);
        int number = integer; // it's auto-boxing
        int number2 = integer.intValue(); //unboxing

        double d = 12.3;
        Double wrapperD = new Double(d);
        Double wrapperp=d; // auto-boxing

        Float f = 12f;
        ArrayList <Float> arrayList = new ArrayList<>();
        arrayList.add(12.0f);

        double fg = 12f;





    }
}
