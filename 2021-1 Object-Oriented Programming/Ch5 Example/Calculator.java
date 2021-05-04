// 추상 메소드
// 선언되어 있으나 구현되어 있지 않은 메소드
// 서브 클레스에서 오버라이딩하여 구현함
// 추상 클래스는 객체 생성 불가

abstract class Calculator {
    public abstract int add(int a, int b);
    public abstract int subtract(int a, int b);
    public abstract double average(int[] a);
    }
    