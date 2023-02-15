package class23;

public class Student {

    void study (){
        System.out.println("Studying...");
    }

    void doHomeWork (){
        System.out.println("Solving homework...");
    }

    void practice (){
        System.out.println("Practicing skills.");
    }
}

class SyntaxStudent extends Student{
    @Override
    void study() {
        System.out.println("Syntax student must study programming.");
    }

    @Override
    void doHomeWork() {
        System.out.println("Syntax student must complete homeworks before next class");
    }

    @Override
    void practice() {
        System.out.println("Syntax student must practice Repls.");
    }
}

class CollegeStudent extends Student{
    @Override
    void study() {
        super.study();
    }

    @Override
    void doHomeWork() {
        super.doHomeWork();
    }

    @Override
    void practice() {
        super.practice();
    }
}

class SchoolStudent extends Student{
    @Override
    void study() {
        super.study();
    }

    @Override
    void doHomeWork() {
        super.doHomeWork();
    }

    @Override
    void practice() {
        super.practice();
    }
}

