package class17;

public class Student {

    int id;

    String name;
    //                 ---- INSTANCE VARIABLES ----
    int age;

    double weight;

    //      ---------------- CONSTRUCTOR --------------
    //- CONSTRUCTORS CAN ONLY HAVE THE SAME NAME AS THE CLASS

    Student(int studentId, String studentName, int studentAge, double studentWeight) {
        id = studentId;
        name = studentName;
        age = studentAge;
        weight = studentWeight;
    }

    void printInfo() {
        System.out.println("Student's Identification is "+id+", student's name is "+name+", student's age is "+age+" and student's weight is "+weight);


    }
}
