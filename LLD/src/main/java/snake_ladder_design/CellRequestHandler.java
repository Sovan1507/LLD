package snake_ladder_design;

public class CellRequestHandler {

    Cell[] cells;

    public CellRequestHandler(Cell[] cells) {
        this.cells = cells;
    }

    public boolean process(Symbol sym, int num) {
        int t = sym.currPos + num;
        if (t >= 100) return true;
        cells[t].setSymbol(sym);
        return true;
    }
}
