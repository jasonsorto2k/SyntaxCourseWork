package HW_1_31_2023;

public class studentsTester {

    public static void main(String[] args) {

        // 2)Write a java Class Students that have a constructor which takes students name and 3 subject grades.
        // Inside your class also have a method to Calculate Average Grade. Test Student class for 5 different students with different marks.
        // Your program should print an average mark of each student's name.
        // NOTE: please use different names for instance and local variables.

        Students Dom = new Students("Dom", 91, 90, 88);
        Dom.printInformation();
        System.out.println("Dom's average grade = " + (Dom.averageGrade()));

        System.out.println();

        Students Letty = new Students("Letty", 92, 91, 85);
        Letty.printInformation();
        System.out.println("Letty's average grade = " + (Letty.averageGrade()));

        System.out.println();

        Students Brian = new Students("Brian", 100, 98, 98);
        Brian.printInformation();
        System.out.println("Brian's average grade = " + (Brian.averageGrade()));

        System.out.println();

        Students Shaw = new Students("Shaw", 98, 99, 97);
        Shaw.printInformation();
        System.out.println("Shaw's average grade = " + (Shaw.averageGrade()));

        System.out.println();

        Students Hobbs = new Students("Brian", 95, 90, 85);
        Hobbs.printInformation();
        System.out.println("Hobbs average grade = " + (Hobbs.averageGrade()));


    }
}
