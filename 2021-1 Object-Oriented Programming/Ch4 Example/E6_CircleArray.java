/*
Ex 04-06.

배열인데 이제 그 값이 객체인....
반지름이 0-4인 Circle 객체 5개를 가지는 배열 생성
배열에 있는 모든 Circle 객체의 면적 출력하기
*/

public class E6_CircleArray { // main class
    public static void main(String[] args) {
        Circle[] c;
        c = new Circle[5];
        for (int i = 0; i < c.length; i++) {
            c[i] = new Circle(i);
        }
        for (int i = 0; i < c.length; i++) {
            System.out.print((int)(c[i].getArea()) + " ");
        }
    }
}

