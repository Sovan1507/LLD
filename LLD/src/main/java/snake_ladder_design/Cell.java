package snake_ladder_design;

import java.util.ArrayList;
import java.util.List;

public class Cell {

    int num;
    SnakeOrLadder snakeOrLadder;
    List<Symbol> symbols;

    public Cell(int num, SnakeOrLadder snakeOrLadder) {
        this.num = num;
        this.snakeOrLadder = snakeOrLadder;
        symbols = new ArrayList<>();
    }

    public void removeSymbol(Symbol s) {
        symbols.remove(s);
    }

    public void setSymbol(Symbol symbol) {
        snakeOrLadder.process(symbol);
    }


}
