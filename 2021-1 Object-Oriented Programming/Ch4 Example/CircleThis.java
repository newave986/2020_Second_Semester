public class CircleThis {
    int radius;

    public CircleThis() {this.radius=1;}
    public CircleThis(int radius) {
        this.radius = radius; 
        // 이름이 동일할 때, 무엇이 field인지 헷갈릴 수 있음
        // 무엇이 객체의 field인지 지정해 줌
    }
    public void set(int radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        CircleThis ob1 = new CircleThis(1); // 반지름이 1인 원 ob1을 생성
        CircleThis ob2 = new CircleThis(2); // 반지름이 2인 원 ob2을 생성
        CircleThis ob3 = new CircleThis(3); // 반지름이 3인 원 ob3을 생성

        ob1.set(4); // ob1의 반지름이 4가 됨 (변경됨)
        ob2.set(5); // ob2의 반지름이 5가 됨 (변경됨)
        ob3.set(6); // ob3의 반지름이 6이 됨 (변경됨)
    }
}
