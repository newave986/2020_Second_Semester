/*
메소드 구현 & 메소드 오버로딩
하나의 클래스 안에 같은 이름의 메소드를 여러 개 선언해도 문제가 없다.

단, 매개변수 갯수가 다르거나, 매개변수의 타입이 달라야 한다.
- 자바의 다형성 특징
*/

public class MethodEx {

    public int getSum(int i, int j) {
        return i + j;
    }

    public int getSum(int i) {
        return i + 1;
    }

    // public int getSum2(int i) {
    //     return i + 1;
    // }

    public static void main(String[] args) {
        MethodEx x = new MethodEx();
        System.out.println(x.getSum(1, 2));
        System.out.println(x.getSum(1));
    }

}
