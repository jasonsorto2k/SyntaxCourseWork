package HW_1_24_2023;

public class task6 {

    public static void main(String[] args) {

        // 6) How would you swap 2 strings without a temporary variable?

        String str1="Jason";
        String str2="Sorto";

        System.out.println("Strings before swap are "+str1+" & "+str2);

        str1=str1+str2;
        str2=str1.substring(0, str1.length()-str2.length());
        str1=str1.substring(str2.length());

        System.out.println("Strings after swap are "+str1+" & "+str2);
    }
}



