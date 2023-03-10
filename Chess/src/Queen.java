public class Queen extends Piece {
    public Queen(int positionX, int positionY, boolean color, boolean hasMoved) {
        super(positionX, positionY, color, hasMoved);
    }
    public boolean isMoveValid(int positionX, int positionY) {
        int lastPositionX = getPositionX();
        int lastPositionY = getPositionY();
        if (positionX == lastPositionX && positionY != lastPositionY) {
            return true;
        } else if (positionX != lastPositionX && positionY == lastPositionY) {
            return true;
        } else if (positionX == lastPositionX + 1 && positionY == lastPositionY + 1) {
            return true;
        } else if (positionX == lastPositionX + 1 && positionY == lastPositionY) {
            return true;
        } else if (positionX == lastPositionX + 1 && positionY == lastPositionY - 1) {
            return true;
        } else if (positionX == lastPositionX && positionY == lastPositionY + 1) {
            return true;
        } else if (positionX == lastPositionX && positionY == lastPositionY - 1) {
            return true;
        } else if (positionX == lastPositionX - 1 && positionY == lastPositionY + 1) {
            return true;
        } else if (positionX == lastPositionX - 1 && positionY == lastPositionY) {
            return true;
        } else return positionX == lastPositionX - 1 && positionY == lastPositionY - 1;
    }
}

