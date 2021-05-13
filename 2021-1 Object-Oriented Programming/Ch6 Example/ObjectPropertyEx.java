// Ex 06-01.
// Object Class로 객체의 속성 알아 보기
// 객체 래퍼런스만으로 객체의 클래스명, 해스코드 값, 객체의 문자열을 출력할 수 있다.

class Point {
    private int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class ObjectPropertyEx {
    public static void print(Object obj) {
        System.out.println(obj.getClass().getName()); // class name
        System.out.println(obj.hashCode()); // hash code value
        System.out.println(obj.toString()); // object to string
        System.out.println(obj); // print object
    }
    public static void main(String[] args) {
        Point p = new Point(2, 3);
        print(p);
    }
}
