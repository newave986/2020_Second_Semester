/*
04-06.
04-05 번의 Circle 클래스와 CircleManager 클래스를 수정하여 문제에서 주어진 실행 결과처럼 되게 해라.
*/

import java.util.Scanner;

class CircleModify {
    private double x, y;
    private int radius;

    public CircleModify(double x, double y, int radius) {
        this.x = x; this.y = y; this.radius = radius;
    }

    public void show() {
        System.out.println("가장 면적이 큰 원은 + (" + x + "," + y + ")" + radius);
    }
}

public class Q6_CircleManagerModify {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Circle c[] = new Circle[3]; // 3개의 Circle 배열 선언

        int maxRad = -999; // 최대 면적을 저장할 maxRad를 선언
        int maxCircle = -1; // 최대 면적을 가지는 원의 index 값을 저장할 maxCircle을 선언

        for (int i = 0; i < c.length; i ++) {

            System.out.print("x, y, radius >>");
            double x = s.nextDouble(); // x 값 읽기
            double y = s.nextDouble(); // y 값 읽기
            int radius = s.nextInt(); // 반지름 읽기

            if (maxRad < radius) { 
                maxRad = radius; 
                maxCircle = i;
            }
            c[i] = new Circle(x, y, radius);// Circle 객체 생성
        }

        c[maxCircle].show();

        s.close();
    }


}