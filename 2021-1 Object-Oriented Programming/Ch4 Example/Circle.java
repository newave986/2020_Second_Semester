/* 
Circle.java

클래스 구성
*/

// 생성자 메소드: Class의 객체를 만들 때 호출됨
// 그동안은 생성자 작성하지 않아도 되었음
// -> 생성자를 작성하지 않으면, 자바 내에서 기본 생성자가 컴파일러를 통해 자동적으로 생성되도록 만듦

public class Circle {

    // 필드
    public int radius; 
    public String name; 

    // 메소드 (생성자)
    public Circle() {
    } 
    // 원의 생성자 메소드
    // return 타입이 없고 클래스 이름과 동일한 메소드
    // Circle이라는 것이 객체로 만들어질 때, 우리가 작성을 하면 자동으로 호출하여 객체를 만듦
    // 개발자가 호출하는 메소드가 아니고, 컴파일러가 자동으로 호출하여 알아서 사용함
    // "초기화하는 값"을 설정해 줄 수 있음

    // 메소드
    public double getArea() { 
     return 3.14 * radius * radius;
    }
}