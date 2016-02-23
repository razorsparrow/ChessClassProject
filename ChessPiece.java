public abstract class ChessPiece implements IChessPiece {

    private Player owner;

    public ChessPiece(Player players) {
        owner = players;
    }

    public abstract String type();

    public Player player() {
        return owner;
        // complete this
    }

    public boolean isValidMove(Move move, IChessPiece[][] board) {
        // complete this
        if(this.type()=="Rook"){

        }
        if(this.type()=="Pawn"){

        }
        if(this.type()=="King"){
            return false;
        }

        if(this.type()=="Queen"){
            return false;
        }
        if(this.type()=="Bishop"){
            return false;
        }

        if(this.type()=="Knight"){
            return false;
        }

        return false;
    }
}
