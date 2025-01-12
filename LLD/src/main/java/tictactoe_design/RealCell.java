package tictactoe_design;

public class RealCell extends Cell{

    public RealCell(int x, int y) {
        super(x, y);
    }

    @Override
    boolean add(Symbol s) {
        setSym(s); return true;
    }


}
