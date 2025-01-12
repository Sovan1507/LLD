package solid.observer_design_pattern.obervable;

public class TV extends Observable {

    private String name = "Sony TV";

    public TV() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
