import java.util.ArrayList;

public class Board {
    private ArrayList<Square> squares;

    public Board(ArrayList<Square> squares) {
        this.squares = squares;
    }

    public Square getSquare(Square oldLoc, int fvTot) {
        return squares.get(fvTot);
    }
}
