package solid.strategy_pattern;

import solid.strategy_pattern.strategy.DriveStrategy;

public class SUV extends Car {

    public SUV(DriveStrategy ds) {
        super(ds);
    }


}
