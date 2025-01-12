package solid.strategy_pattern;

import solid.strategy_pattern.strategy.RegularDriveStrategy;
import solid.strategy_pattern.strategy.SUVDriveStrategy;

public class Main {

    public static void main(String[] args) {

        Car sedan = new Sedan(new RegularDriveStrategy());
        sedan.drive();
        Car suv = new SUV(new SUVDriveStrategy());
        suv.drive();


    }
}
