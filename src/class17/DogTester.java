package class17;

public class DogTester {

    public static void main(String[] args) {

        Dog pitbull = new Dog("Husky", "Pitbull", "Grey", 8, 80.2);
        pitbull.printInfo();

        Dog germanShepard = new Dog("Scout", "German Shepard", "White & Black", 5, 75.9);
        germanShepard.printInfo();

        Dog rottwieler = new Dog("Chomp", "Rottweiler", "Black", 7, 110.5);
        rottwieler.printInfo();

        Dog caneCorso = new Dog("Don", "Cane Corso", "White", 9, 90.5);
        caneCorso.printInfo();

        Dog bullMastiff = new Dog("Buck", "Bull Mastiff", "Brown", 11, 115.9);
        bullMastiff.printInfo();
    }


}

