// Point를 상속받아 색을 가진 점을 나타내는 ColorPoint 클래스를 작성
// 5번의 ColorPoint 클래스에서 조금 더 수정

class ColorPoint_6 extends Point {
    private String color;

    public ColorPoint_6() {
        super(0, 0);
        this.color = "BLACK";
    }

    public ColorPoint_6(int x, int y) {
        super(x, y);
        this.color = "BLACK";
    }

    public void setXY(int x, int y) { move(x, y); }

    public void setColor(String color) { this.color = color; }

    public String toString() {
        return color + "색의 (" + getX() + "," + getY() + ")의 점";
    }
}