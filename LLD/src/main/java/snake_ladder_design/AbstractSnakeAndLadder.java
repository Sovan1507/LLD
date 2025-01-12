package snake_ladder_design;

public class AbstractSnakeAndLadder implements SnakeOrLadder {

    Cell to;
    private Cell from;

    public AbstractSnakeAndLadder(Cell to) {
        this.to = to;
    }

    @Override
    public void process(Symbol s) {
        to.setSymbol(s);
        from.removeSymbol(s);;
    }

    @Override
    public void setFrom(Cell s) {
        this.from = s;
    }
}
