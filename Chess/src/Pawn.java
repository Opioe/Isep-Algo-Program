public class Pawn extends Piece {
    public Pawn(int positionX, int positionY, boolean color, boolean hasMoved) {
        super(positionX, positionY, color, hasMoved);
    }
    public boolean isMoveValid(int positionX, int positionY) {
        int lastPositionX = getPositionX();
        int lastPositionY = getPositionY();
        if (!isColor()) {
            if (positionX == lastPositionX && positionY == lastPositionY + 1) {
                return true;
            } else if (positionX == lastPositionX && positionY == lastPositionY + 2 && lastPositionY == 1) {
                return true;
            } else if (positionX == lastPositionX + 1 && positionY == lastPositionY + 1) {
                return true;
            }else return positionX == lastPositionX - 1 && positionY == lastPositionY + 1;
        }
        else {
            if (positionX == lastPositionX && positionY == lastPositionY - 1) {
                return true;
            } else if (positionX == lastPositionX && positionY == lastPositionY - 2 && lastPositionY == 6) {
                return true;
            } else if (positionX == lastPositionX + 1 && positionY == lastPositionY - 1) {
                return true;
            }else return positionX == lastPositionX - 1 && positionY == lastPositionY - 1;
        }
    }
}

