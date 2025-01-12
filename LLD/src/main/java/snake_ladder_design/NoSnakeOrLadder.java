package snake_ladder_design;

public class NoSnakeOrLadder extends AbstractSnakeAndLadder {

    public NoSnakeOrLadder(Cell to) {
        super(to);
    }

    @Override
    public void process(Symbol s) {
        System.out.println("NA");
    }

    @Override
    public void setFrom(Cell s) {
        System.out.println("NA");
    }
}
