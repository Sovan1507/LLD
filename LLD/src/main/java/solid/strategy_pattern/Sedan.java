package solid.strategy_pattern;

import solid.strategy_pattern.strategy.DriveStrategy;

public class Sedan extends Car {
    public Sedan(DriveStrategy ds) {
        super(ds);
    }
}
