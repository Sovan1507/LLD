package tictactoe_design;

public class ProxyCell extends Cell {
    public ProxyCell(Cell c) {
        super(c);
    }

    @Override
    boolean add(Symbol s) {
        if (cell.sym != null) {
            cell.add(s);
            return false;
        } else return false;

    }
}
