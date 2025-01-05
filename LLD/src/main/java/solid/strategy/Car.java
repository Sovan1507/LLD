package solid.strategy;

public abstract class Car {

    private final DriveStrategy ds;

    public void drive() {
        ds.drive();
    }

    public Car(DriveStrategy ds) {
        this.ds = ds;
    }
}
