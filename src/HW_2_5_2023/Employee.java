package HW_2_5_2023;

public class Employee {

    // 2.Create an Employee class that will have variables and methods. Constructor that should initialize instance variables
    //Create 2 subclasses FullTime and PartTime Employees that should have own variables and methods.
    //Create a Tester Subclass from FullTime Employee and add some features and methods to the Tester Class.
    //Test your code!

    String name;
    int age;
    int IDNumber;

    Employee(String name, int age, int IDNumber) {
        this.name = name;
        this.age = age;
        this.IDNumber = IDNumber;

    }

    public void printInfo() {
        System.out.println("Employees name is " + name + ", employees age is " + age + " and the employees ID number is " + IDNumber);
    }
}

class Fulltime extends Employee {

    int hours;

    Fulltime(String name, int age, int IDNumber, int hours) {
        super(name, age, IDNumber);
        this.hours=hours;
    }

    void hoursWorked(){
        System.out.println("Employee works "+hours+" hours a day!");
    }
}

class PartTime extends Employee {

    int hoursOff;

    PartTime(String name, int age, int IDNumber,int hoursOff){
        super(name,age,IDNumber);
        this.hoursOff=hoursOff;
    }

    void hoursNotWorked(){
        System.out.println("Employee is off "+hoursOff+" hours in a full workday!");
    }


}

