package solid.strategy_pattern.strategy;

public interface DriveStrategy {
    default void drive() {
        System.out.println("drive for regular car");
    }
}
