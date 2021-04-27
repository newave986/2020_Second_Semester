class PointSuper {
    private int x, y;
    public PointSuper() {
        this.x = this.y = 0;
    }
    public PointSuper(int x, int y) {
        this.x = x; this.y = y;
    }
    public void showPoint() { // 점의 좌표 출력
        System.out.println("(" + x + "," + y + ")");
    }
}

class ColorPointSuper extends PointSuper {
    private String color;
    public ColorPointSuper(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }
    public void showColorPoint() {
        System.out.print(color);
        showPoint();
    }
}

public class E3_SuperEx {
    public static void main(String[] args) {
        ColorPointSuper cp = new ColorPointSuper(5, 6, "blue");
        cp.showColorPoint();
    }
}
