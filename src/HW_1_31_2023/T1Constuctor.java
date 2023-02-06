package HW_1_31_2023;

public class T1Constuctor {

    // 1) Write a java class that will have a constructor: one with parameters and second without any parameters.
    // Create a separate Test class where you will execute both of the constructors 1 by 1.

    String name;
    String breed;
    String color;
    int age;
    double weight;

    T1Constuctor(String catName, String catBreed, String catColor, int catAge, double catWeight) {

        name = catName;
        breed = catBreed;
        color = catColor;
        age = catAge;
        weight = catWeight;
    }


    void printInfo() {
        System.out.println(" Name " + name + " breed " + breed + " age " + age + " weight " + weight);
    }

    T1Constuctor(){

    }


}
