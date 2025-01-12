package tictactoe_design;

public abstract class Cell {

    private Cell c;
    int x, y;
    Symbol sym;
    Cell cell;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Cell(Cell y) {
        this.c = y;
    }

    public Symbol getSym() {
        return sym;
    }

    public void setSym(Symbol sym) {
        this.sym = sym;
    }

    abstract boolean add (Symbol s);
}
