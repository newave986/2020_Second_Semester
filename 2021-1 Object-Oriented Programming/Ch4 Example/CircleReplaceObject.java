// 객체의 치환
// 객체가 복사되는 것이 아니라
// "레퍼런스"가 복사되는 것. (주소값이 복사)

// 한 객체를 가르키는 값들이 복사가 되는 것임.

public class CircleReplaceObject {
    int radius;

    public CircleReplaceObject(int radius) {this.radius = radius; }
    public void set(int radius) {this.radius = radius;}

    public static void main(String[] args) {
        CircleReplaceObject ob1 = new CircleReplaceObject(1); // 반지름이 1인 원 ob1을 생성
        CircleReplaceObject ob2 = new CircleReplaceObject(2); // 반지름이 2인 원 ob2을 생성
        CircleReplaceObject s;

        s = ob2;
        ob1 = ob2;
        System.out.println("ob1.radius : " + ob1.radius);
        System.out.println("ob2.radius : " + ob2.radius);
    }
}
