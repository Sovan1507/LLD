package decorator_pattern;

public class Cheese implements ToppingsDecorator {

    private final Pizza p;

    public Cheese(Pizza p) {
        this.p = p;
    }

    @Override
    public int cost() {
        return 10 + p.cost();
    }
}
