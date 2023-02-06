package class17;

public class Dog {

    String name;

    String breed;
    //                 ---- INSTANCE VARIABLES ----
    String color;

    int age;

    double weight;

    //      ---------------- CONSTRUCTOR --------------
    //- CONSTRUCTORS CAN ONLY HAVE THE SAME NAME AS THE CLASS

    Dog(String dogName, String dogBreed, String dogColor, int dogAge, double dogWeight){

        name = dogName;
        breed = dogBreed;
        color = dogColor;
        age = dogAge;
        weight = dogWeight;
    }

    void printInfo(){
        System.out.println(" Name "+name+" breed "+breed+" age "+age+" weight "+weight);
    }
}


