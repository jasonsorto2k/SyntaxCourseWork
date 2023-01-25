package HW_1_24_2023;

public class task3 {

    public static void main(String[] args) {

        // 3) You have a String a= "Is it saturday? Is it raining? Do we have a Java Class today?"
        // How would you find out how many sentences are in that String?

        String str = "Is it saturday? Is it raining? Do we have a Java Class today?";

        String [] strArr = str.split("[?]");
        System.out.println(strArr[0].trim());
        System.out.println(strArr[1].trim());
        System.out.println(strArr[2].trim());



    }

}
