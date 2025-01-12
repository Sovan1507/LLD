package decorator_pattern;

public class Mushroom implements ToppingsDecorator {

    private final Pizza p;

    public Mushroom(Pizza p) {
        this.p = p;
    }

    @Override
    public int cost() {
        return 50 + p.cost();
    }
}
