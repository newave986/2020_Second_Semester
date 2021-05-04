// Point를 상속받아 색을 가진 점을 나타내는 ColorPoint 클래스를 작성
// 생성자, setXY(), setColor(), toString() 작성 필요

class ColorPoint_5 extends Point {
    String color;

    public ColorPoint_5(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }
    public void setXY(int x, int y) { move(x, y); }
    public void setColor(String color) { this.color = color; }
    public String toString() {
        return color + "색의 (" + getX() + "," + getY() + ")의 점";
    }
}