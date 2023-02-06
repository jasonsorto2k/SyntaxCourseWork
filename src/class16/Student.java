package class16;

public class Student {

    String name;
    String id;
    static   String schoolName;
    int age;
    double weight;
    void printName(){
        int SSN=1345454354;
        System.out.println(name);
        System.out.println(schoolName);
    }

    static void printStudentInfo(){
        // System.out.println(name); Can't access here
        System.out.println(schoolName);
    }
}

