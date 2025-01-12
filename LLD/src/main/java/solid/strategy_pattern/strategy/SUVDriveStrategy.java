package solid.strategy_pattern.strategy;

public class SUVDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("SUV drive strategy");
    }
}
