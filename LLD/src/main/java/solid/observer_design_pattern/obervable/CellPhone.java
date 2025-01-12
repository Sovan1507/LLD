package solid.observer_design_pattern.obervable;

public class CellPhone extends Observable {

    private String name = "Iphone";

    public CellPhone() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
