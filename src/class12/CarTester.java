package class12;

public class CarTester {

    public static void main(String[] args) {

        // First things first, we must create the object of class

        Car bmw = new Car();
        bmw.make="BMW";
        bmw.model="i7";
        bmw.year=2023;
        bmw.color="White";

        bmw.moveForward();
        bmw.applyBrakes();

        Car nissan = new Car ();
        nissan.make="Datsun";
        nissan.model="240z";
        nissan.year=1970;
        nissan.color="Black";

        nissan.moveForward();
        nissan.applyBrakes();
    }
}
