public class King extends ChessPiece {

    protected King(Player player) {
        super(player);
    }

    @Override
    public String type() {
        return "King";
    }

}
