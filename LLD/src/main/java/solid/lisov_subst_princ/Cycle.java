package solid.lisov_subst_princ;

public class Cycle implements Bike{
    public void turnOnEngine(){
        throw new AssertionError("not possible");
    }
}
