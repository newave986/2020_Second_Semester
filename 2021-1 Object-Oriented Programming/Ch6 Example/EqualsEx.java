class PointEquals {
    private int x, y;
    public PointEquals(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public boolean equals(Object obj) {
        PointEquals p = (PointEquals)obj;
        if (x == p.x && y == p.y) return true;
        else return false;
    }
}

class Rect {
    private int width;
    private int height;
    public Rect(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public boolean equals(Object obj) {
        Rect p = (Rect) obj;
        if (width*height == p.width*p.height) return true;
        else return false;
    }
}

public class EqualsEx {
    public static void main(String[] args) {
        PointEquals a = new PointEquals(2, 3);
        PointEquals b = new PointEquals(2, 3);
        PointEquals c = new PointEquals(3, 4);

        if (a==b) System.out.println("a==b");
        if (a.equals(b)) System.out.println("a is equal to b");
        if (a.equals(c)) System.out.println("a is equal to c");
    
        Rect n = new Rect(2, 3);
        Rect m = new Rect(3, 2);
        Rect l = new Rect(3, 4);

        if (n.equals(m)) System.out.println("n is equal to m");
        if (n.equals(l)) System.out.println("n is equal to l");
        if (m.equals(l)) System.out.println("m is equal to l");
    }
}
