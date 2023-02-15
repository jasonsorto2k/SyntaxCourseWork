package class22;

public class Employee {

    String name;
    int baseSalary = 30000;
    int baseHolidays = 10;

    void printSalary() {
        System.out.println(baseSalary);
    }

    void printHolidays() {
        System.out.println(baseHolidays);
    }
}

    class officeBoy extends Employee {

    }

    class Manager extends Employee {

        void printSalary() {
            System.out.println((baseSalary * 4) + 20000);
        }

    }

    class Developer extends Employee{

        void printSalary() {
            System.out.println((baseSalary * 3) +30000);
        }

    }

    class QA extends Employee{

        void printSalary() {
            System.out.println((baseSalary * 3) +30000);
        }

        void printHolidays() {
            System.out.println(baseHolidays+5);
        }



    }

