import java.util.ArrayList;

public class MGame {
    private int roundCnt;
    private Die[] dice;
    private ArrayList<Player> players;
    private Board board;
    private Piece[] pieces;

    public void playGame(int n, Player[] players) {
        while (this.roundCnt < n) {
            this.playRound();
            for (int i = 0; i < players.length; i++) {
                players[i].takeTurn(this.dice);
            }
            this.roundCnt--;
        }
    }

    private void playRound() {

    }
}
