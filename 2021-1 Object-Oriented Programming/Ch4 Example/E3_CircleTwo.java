/*
Example 04-03.

2개의 생성자를 가진 Circle 클래스 만들기
*/

public class E3_CircleTwo {
    int radius;
    String name;

    public E3_CircleTwo() { // 매개 변수가 없는 생성자
    radius = 1; name = "";
    }

    public E3_CircleTwo(int r, String n) { // 매개 변수가 있는 생성자
    radius = r; name = n;
    }

    public double getArea() {
        return 3.14*radius*radius;
    }

    public static void main(String[] args) {
        E3_CircleTwo pizza = new E3_CircleTwo(10, "Java Pizza");

        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        E3_CircleTwo donut = new E3_CircleTwo();
        donut.name = "Donut Pizza";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);
    }
}   
