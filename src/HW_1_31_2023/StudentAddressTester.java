package HW_1_31_2023;

public class StudentAddressTester {

    // 5) Write a Student class  that have instance variables name and address.
    // Create a constructor that will initialize those variables.
    // Print name & address of given student using displayInfo method.

    public static void main(String[] args) {


        StudentAddress student = new StudentAddress("Jane Doe", "Street 123, Road Rd, USA");
        student.displayInfo();
    }
}