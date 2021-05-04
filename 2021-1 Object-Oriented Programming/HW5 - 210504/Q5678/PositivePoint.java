// Point를 상속받아 양수의 공간에서만 점을 나타냄

class PositivePoint extends Point {
    private int x, y;
    public PositivePoint() { super(0, 0); }
    public PositivePoint(int x, int y) {
        super(x, y);
        if (x < 0 || y < 0) super.move(0, 0);
    }

    protected void move(int x, int y) {
        if (x < 0 || y < 0) this.x = x; this.y = y;
        if (x > 0 && y > 0) super.move(x, y);
    }

    public String toString() {
        return "(" + getX() + "," + getY() + ")의 점";
    }
}
