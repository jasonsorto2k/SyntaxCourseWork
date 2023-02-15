package class25;

interface WashAble {
    void wash();
}

public class SmartWatch implements WashAble {
    @Override
    public void wash() {
        System.out.println("You can wash this Smart Watch with no issues");
    }
}

class Phone implements WashAble {
    @Override
    public void wash() {
        System.out.println("You can wash this phone with no issues");
    }
}

class Inverter implements WashAble {
    @Override
    public void wash() {
        System.out.println("I am IP65 rated you can wash me");

    }
}
