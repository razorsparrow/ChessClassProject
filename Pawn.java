public class Pawn extends ChessPiece{

    protected Pawn(Player player) {
        super(player);
    }

    @Override
    public String type() {
        return "Pawn";
    }

}
