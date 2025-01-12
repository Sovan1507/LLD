package decorator_pattern;

public class Main {

    public static void main(String[] args) {
        Pizza margharitaBasePizza = new MargharitaBasePizza();
        Pizza vegDelightBasePizza = new VegDelightBasePizza();

        // here we are decorating the pizza with different topping like cheese and mushroom
        Pizza pizza1 = new Mushroom(new Cheese(margharitaBasePizza));
        // here we are decorating the pizza with 1 topping mushroom
        Pizza pizza2 = new Mushroom(vegDelightBasePizza);

        System.out.println("pizza cost is: " + pizza1.cost());
        System.out.println("pizza cost is: " + pizza2.cost());

    }
}
