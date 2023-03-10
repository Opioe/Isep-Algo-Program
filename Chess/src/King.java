public class King extends Piece {
    public King(int positionX, int positionY, boolean color, boolean hasMoved) {
        super(positionX, positionY, color, hasMoved);
    }
    public boolean isMoveValid(int positionX, int positionY) {
        int lastPositionX = getPositionX();
        int lastPositionY = getPositionY();
        boolean hasMoved = isHasMoved();
        if (positionX == lastPositionX + 1 && positionY == lastPositionY + 1) {
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
        } else if (positionX == lastPositionX - 1 && positionY == lastPositionY - 1) {
            return true;
        } else if (positionX == lastPositionX + 2 && positionY == lastPositionY && lastPositionX == 4 && lastPositionY == 0 && !hasMoved) {
            return true;
        } else if (positionX == lastPositionX - 2 && positionY == lastPositionY && lastPositionX == 4 && lastPositionY == 0 && !hasMoved) {
            return true;
        } else return false;
    }
}