/**
 * Created by Josh on 2/22/2016.
 */
public class ChessModel implements IChessModel {
    private IChessPiece[][] board;
    private Player player;
    // declare other instance variables as needed

    public ChessModel() {
        // complete this
    }

    public boolean isComplete() {
        return false;
    }

    public boolean isValidMove(Move move) {
        return false;
        // complete this
    }

    public void move(Move move) {
        // complete this
    }

    public boolean inCheck(Player p) {
        return false;
    }

    public Player currentPlayer() {
        return player;
        // complete this
    }

    public int numRows() {
        return 0;
        // complete this
    }

    public int numColumns() {
        return 0;
        // complete this
    }

    public IChessPiece pieceAt(int row, int column) {
        return null;
        // complete this
    }

    // add other public or helper methods as needed
}

