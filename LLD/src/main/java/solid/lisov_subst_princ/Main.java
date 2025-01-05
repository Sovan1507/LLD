package solid.lisov_subst_princ;

public class Main {

    public static void main(String[] args) {
        Bike b = new MotorCycle();
        b.turnOnEngine();

        // this will throw the error, and lot follolwing the Liskov substitution principle,
        // cause the cycle is narrowing down the turnOnEngine functionality by throwing the assertion error
        Bike b1 = new Cycle();
        b.turnOnEngine();
    }
}
