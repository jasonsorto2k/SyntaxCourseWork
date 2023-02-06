package HW_2_5_2023;

public class EmployeeTester {

    public static void main(String[] args) {

        Employee e1 = new Employee("Jason", 22, 12345);
        e1.printInfo();

        Fulltime f1 = new Fulltime("Jack",25,67890,8);
        f1.printInfo();
        f1.hoursWorked();

        PartTime p1 = new PartTime("Emily",24,101112,3);
        p1.printInfo();
        p1.hoursNotWorked();

    }
}
