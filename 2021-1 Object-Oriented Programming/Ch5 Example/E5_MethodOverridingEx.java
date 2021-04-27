// Method Overriding
// Super Class의 Method를 Sub Class에서 재정의함
// Method 무시/덮어쓰기
// 동적 바인딩 발생 - sub class에 overriding된 method가 무조건 실행됨
// 다형성 실현

class Shape { // super class
    public Shape next;
    public Shape() { next = null; }

    public void draw() {
        System.out.println("Shape");
    }
}

class Line extends Shape {
    public void draw() { // method overriding
        System.out.println("Line");
    }
}

class Rect extends Shape {
    public void draw() { // method overriding 
        System.out.println("Rect");
    }
}

class Circle extends Shape {
    public void drae() { // method overriding
        System.out.println("Circle");
    }
}

public class E5_MethodOverridingEx {
    static void paint(Shape p) {
        p.draw();
    }

    public static void main(String[] args) {
        Line line = new Line();
        paint(line);
        paint(new Shape());
        paint(new Line());
        paint(new Rect());
        paint(new Circle());
    }
}
