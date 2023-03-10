public class Rook extends Piece {
    public Rook(int positionX, int positionY, boolean color, boolean hasMoved) {
        super(positionX, positionY, color, hasMoved);
    }
    public boolean isMoveValid(int positionX, int positionY) {
        int lastPositionX = getPositionX();
        int lastPositionY = getPositionY();
        if (positionX == lastPositionX && positionY != lastPositionY) {
            return true;
        } else return positionX != lastPositionX && positionY == lastPositionY;
    }
}

