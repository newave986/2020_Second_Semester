/*
04-11.
더하기, 빼기, 곱하기, 나누기를 수행하는 각 클래스 Add, Sub, Mil, Div를
문제에서 주어진 조건에 따라 만들고 연산을 수행하는 main() 메소드를 작성.
*/

import java.util.Scanner;

class Add {
    int a, b;
    void setValue(int a, int b) { this.a = a; this.b = b; }
    int calculate() { return a + b; }
} // 더하기 연산 수행하는 클래스 Add

class Sub {
    int a, b;
    void setValue(int a, int b) { this.a = a; this.b = b; }
    int calculate() { return a - b; }
} // 빼기 연산 수행하는 클래스 Sub

class Mul {
    int a, b;
    void setValue(int a, int b) { this.a = a; this.b = b; }
    int calculate() { return a * b; }
} // 곱하기 연산 수행하는 클래스 Mul

class Div {
    int a, b;
    void setValue(int a, int b) { this.a = a; this.b = b; }
    double calculate() { return (double) a / b ; }
} // 나누기 연산 수행하는 클래스 Div


public class Q11_ClassCalculate {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("두 정수와 연산자를 입력하시오>>");

        int a = s.nextInt();
        int b = s.nextInt();
        String c = s.next();

        switch (c) {
            case "+": 
            Add n = new Add();
            n.setValue(a, b);
            System.out.print(n.calculate());
            break;
            
            case "-":
            Sub m = new Sub();
            m.setValue(a, b);
            System.out.print(m.calculate());
            break;

            case "*":
            Mul k = new Mul();
            k.setValue(a, b);
            System.out.print(k.calculate());
            break;

            case "/":
            Div j = new Div();
            j.setValue(a, b);
            System.out.print(j.calculate());
            break;
        }
        s.close();
    }
}
