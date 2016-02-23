public class Queen extends ChessPiece {

    protected Queen(Player player) {
        super(player);
    }

    @Override
    public String type() {
        return "Queen";
    }

}
