package snake_ladder_design;

public class Board {

    CellRequestHandler cellRequestHandler;

    public Board(CellRequestHandler cellRequestHandler) {
        this.cellRequestHandler = cellRequestHandler;
    }

    public boolean put(Symbol sym, int num) {
        return cellRequestHandler.process(sym, num);
    }


}
