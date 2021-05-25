/* 
Example 7-2.
점 (x, y) 표현하는 Point 클래스에 대하여 Point 객체만 다루는 벡터를 작성하기.
*/

import java.util.Vector;

public class Ex2_Point {
    public static void main(String[] args) {
        // Point 객체를 요소로만 가지는 벡터 생성
        Vector<Point> v = new Vector<Point>();

        v.add(new Point(2, 3));
        v.add(new Point(-5, 20));
        v.add(new Point(30, -8));

        v.remove(1);

        for(int i = 0; i < v.size(); i++) {
            Point p = v.get(i);
            System.out.println(p);
        }
    }
}
