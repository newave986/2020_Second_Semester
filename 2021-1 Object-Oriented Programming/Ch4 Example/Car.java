/* 
Car.java

static 예시
*/

public class Car {
    static int count = 0;
    // 이때 static 사용:: 공유 멤버로 field나 method 만들겠다는 이야기.
    String color;

    Car() {
        count++;
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();
        System.out.println(count);

    }
}
