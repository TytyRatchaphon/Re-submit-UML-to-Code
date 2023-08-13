import java.util.List;

public class Player {
    private String name;
    private Piece piece;
    private Board board;
    private List<Die> dice;

    public Player(String name, Piece piece, Board board, List<Die> dice) {
        this.name = name;
        this.piece = piece;
        this.board = board;
        this.dice = dice;
    }

    public void takeTurn(Die[] dice) {
        int fv = 0;
        for (int i = 0; i < dice.length; i++) {
            dice[i].roll();
            fv += dice[i].getFaceValue();
        }

        Square oldLoc = this.piece.getLocation();
        Square newLoc = this.board.getSquare(oldLoc, fv);

        this.piece.setLocation(newLoc);
    }
}
