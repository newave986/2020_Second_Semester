/*
04-04.
문제의 조건에 맞춰 직사각형을 표현하는 Rectangle 클래스를 작성한다.
*/

public class Q4_Rectangle {

    private int x, y, width, height;
    // int type의 x, y, width, heigh 필드 생성

    public Q4_Rectangle(int x, int y, int width, int height) {
        this.x = x; this.y = y; this.width = width; this.height = height;
    }
    // 주어진 정보를 받아 사각형을 만드는 생성자 생성

    public int square() {
        return width * height;
    }
    // 사각형의 넓이를 리턴하는 square 메서드 생성

    public void show() {
        System.out.println("(" + x + "," + y + ")" + "에서 크기가 " + width + "x" + height + "인 사각형");
    }
    // 사각형의 좌표와 넓이를 화면에 출력하는 메서드 생성

    public boolean contains(Q4_Rectangle r) {
        if ((x < r.x) && (r.x + r.width < x + width)) {
            if ((y < r.y) && (r.y + r.height < y + height)) 
                return true;
            else return false;
        }
        else return false;
    }
    // 매개변수로 받은 r이 현 사각형 안에 있으면 true 리턴하는 메서드 생성

    public static void main(String args[]) {
        Q4_Rectangle r = new Q4_Rectangle(2, 2, 8, 7);
        Q4_Rectangle s = new Q4_Rectangle(5, 5, 6, 6);
        Q4_Rectangle t = new Q4_Rectangle(1, 1, 10, 10);

        r.show();
        System.out.println("s의 면적은 " + s.square());
        if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
        if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
    }
}