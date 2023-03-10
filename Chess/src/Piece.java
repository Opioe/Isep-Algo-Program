public abstract class Piece {
    private int positionX;
    private int positionY;
    private boolean color;
    private boolean hasMoved;

    public Piece(int positionX, int positionY, boolean color, boolean hasMoved) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.color = color;
        this.hasMoved = hasMoved;
    }


    public int getPositionX() {
        return positionX;
    }
    public int getPositionY() {
        return positionY;
    }
    public boolean isColor() {
        return color;
    }
    public boolean isHasMoved() {
        return hasMoved;
    }
    public void setPosition(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }
    public void setColor(boolean color) {
        this.color = color;
    }
    public void setHasMoved() {
        this.hasMoved = true;
    }
    public abstract boolean isMoveValid(int positionX, int positionY);
}
