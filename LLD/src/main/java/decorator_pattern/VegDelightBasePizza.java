package decorator_pattern;

public class VegDelightBasePizza implements Pizza{
    @Override
    public int cost() {
        return 50;
    }
}
