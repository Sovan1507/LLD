package tictactoe_design;

public class CellHandler {

    Cell[][] cells;

    public CellHandler(Cell[][] cells) {
        this.cells = cells;
    }

    public boolean add(Cell cell, Symbol s) {
        return cell.add(s);
    }
}
