package class21;

public class Animal {

        String name;
        String color="Black";

    }

    class Cat extends Animal{
        String color="white";
        int age=10;
        double weight;

        void printColor(){
            String color ="blue";
            System.out.println(this.color);
            System.out.println(super.color);
            System.out.println(color);
        }

    }

