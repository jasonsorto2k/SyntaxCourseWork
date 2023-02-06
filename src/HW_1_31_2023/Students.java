package HW_1_31_2023;

public class Students {

    // 2)Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    // Inside your class also have a method to Calculate Average Grade. Test Student class for 5 different students with different marks.
    // Your program should print an average mark of each student's name.
    // NOTE: please use different names for instance and local variables.

    String name;
    int mathGrade;
    int scienceGrade;
    int historyGrade;


    Students(String studentName, int sMath, int sScience, int sHistory) {

        name = studentName;
        mathGrade = sMath;
        scienceGrade = sScience;
        historyGrade = sHistory;

    }

    public void printInformation() {
        System.out.println("Student's name is " +name+ " their mark in Math is a/an "+mathGrade+" their mark in Science is a/an " +scienceGrade+ " and their mark in history is a/an " + historyGrade);
    }

    public int averageGrade() {

        int avg = (mathGrade + scienceGrade + historyGrade) / 3;


        return avg;
    }
}
