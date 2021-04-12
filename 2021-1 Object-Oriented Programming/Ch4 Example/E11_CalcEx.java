/*
04-11.

static 멤버를 가진 Calc 클래스 작성
static: 1. 전역 변수나 전역 함수를 만드는 데에 사용함
        2. 공유 멤버를 작성할 때 사용함: static field/method 하나만 생성하여 클래스의 객체들과 공유
*/

class Calc {
    public static int abs(int a) { return a > 0 ? a:-a;}
    public static int max(int a, int b) { return (a>b) ? a:b;}
    public static int min(int a, int b) { return (a>b) ? b:a;}
}

public class E11_CalcEx {
    public static void main(String[] args) {
        System.out.println(Calc.abs(-5));
        System.out.println(Calc.max(10, 8));
        System.out.println(Calc.min(-3, -8));
    }
}
