public class Knight extends ChessPiece{

    protected Knight(Player player) {
        super(player);
    }

    @Override
    public String type() {
        return "Knight";
    }

}
