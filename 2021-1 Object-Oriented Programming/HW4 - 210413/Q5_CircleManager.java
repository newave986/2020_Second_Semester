/*
04-05.
문제의 조건에 맞춰 Circle 클래스와 CircleManager 클래스를 완성한다. 
2개의 클래스를 만들고, 객체 배열을 만들어라.
*/

import java.util.Scanner;

class Circle {
    private double x, y;
    private int radius;

    public Circle(double x, double y, int radius) {
        this.x = x; this.y = y; this.radius = radius;
    }

    public void show() {
        System.out.println("(" + x + "," + y + ")" + radius);
    }
}

public class Q5_CircleManager {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Circle c[] = new Circle[3]; // 3개의 Circle 배열 선언

        for (int i = 0; i < c.length; i ++) {
            System.out.print("x, y, radius >>");
            double x = s.nextDouble(); // x 값 읽기
            double y = s.nextDouble(); // y 값 읽기
            int radius = s.nextInt(); // 반지름 읽기
            c[i] = new Circle(x, y, radius);// Circle 객체 생성
        }

        for (int i = 0; i < c.length; i++) c[i].show(); // 모든 Circle 객체 출력
        s.close();
    }

}