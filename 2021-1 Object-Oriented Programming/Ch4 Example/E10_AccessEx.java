/*
04-10.

접근 지정자
*/

class Sample {
    public int a;
    public int b;
    int c;
    // public, default 지정자로 선언된 것은
    // 같은 패키지에 속한 다른 클래스에서 접근 가능
    // private로 선언된 것은 AccessEx 클래스에서 접근 불가능
    // 따라서 같은 패키지 안에 다른 클래스에서 호출해 이용하고 싶다면
    // public 접근 지정자를 이용할 것
}

public class E10_AccessEx {
    public static void main(String[] args) {
        Sample aClass = new Sample();
        aClass.a = 10;
        aClass.b = 10;
        aClass.c = 10;
    }
}
