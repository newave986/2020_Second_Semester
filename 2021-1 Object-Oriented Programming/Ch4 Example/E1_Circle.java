/*
Example 04-01.

radius와 name을 가지는 Circle class 생성
Circle class의 객체 생성
*/

public class E1_Circle {
    int radius;
    String name;

    public E1_Circle() {}

    public double getArea() {
        return 3.14*radius*radius;
    }

    public static void main(String[] args) {
        E1_Circle pizza;
        pizza = new E1_Circle();
        pizza.radius = 10;
        pizza.name = "java pizza";
        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        E1_Circle donut = new E1_Circle();
        donut.radius = 2;
        donut.name = "java donut";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);
    }
}

