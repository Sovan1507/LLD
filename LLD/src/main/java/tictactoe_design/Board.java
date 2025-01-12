package tictactoe_design;

public class Board {

    CellHandler cellhandler;

    public void add (Cell c, Symbol s) {
        cellhandler.add (c, s);
    }

    public boolean isThereWinner () {
        return false;
    }
}
