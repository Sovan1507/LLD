package solid.strategy;

public class Main {

    public static void main(String[] args) {

        Car sedan = new Sedan(new DriveStrategy() {});
        sedan.drive();
        Car suv = new SUV(new SUVDriveStrategy() {});
        suv.drive();


    }
}
