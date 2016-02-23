public class Bishop extends ChessPiece {

    protected Bishop(Player player) {
        super(player);
    }

    @Override
    public String type() {
        return "Bishop";
    }

}
