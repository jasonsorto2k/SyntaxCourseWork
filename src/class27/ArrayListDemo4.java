package class27;

import java.util.ArrayList;

public class ArrayListDemo4 {

    public static void main(String[] args) {

        ArrayList<Boolean> TorF = new ArrayList<>();

        TorF.add(true);
        TorF.add(true);
        TorF.add(false);
        TorF.add(true);
        TorF.add(false);

        System.out.println(TorF.get(0));

        for (int i = 0; i < TorF.size(); i++) {
            System.out.println(TorF.get(i));            // For loop

        }

        int i = 0;
        while (i < TorF.size()) {
            System.out.println(TorF.get(i));            // While loop
            i++;

        }
    }
}
