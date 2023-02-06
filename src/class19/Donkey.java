package class19;

public class Donkey {

    String name;
    int age;
    double weight;

    /*
    Donkey(){
        System.out.println("This is a non argument constructor.");
        }

    Donkey(String donkeyName, int donkeyAge, double donkeyWeight){

        name = donkeyName;
        age = donkeyAge;
        weight = donkeyWeight;
    }
    */

    Donkey(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;

    }


    void print() {
        System.out.println("Donkey's name is " + name + ", age is " + age + " and it's weight is " + weight);
    }

}
