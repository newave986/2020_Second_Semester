/*
Q12. CalculateIf
실수와 사칙 연산을 입력 받아 계산하는 계산기 제작.

단, If문을 이용할 것.
*/

import java.util.Scanner;

public class Q12CalculateIf {
    public static void main(String[] arg) {

        Scanner s = new Scanner(System.in);

        System.out.print("연산>>");
        double a = s.nextDouble();
        String b = s.next();
        double c = s.nextDouble();

        if (b.equals("+")) System.out.print(a + b + c + "의 계산 결과는 " + (a+c));
        else if (b.equals("-")) System.out.print(a + b + c + "의 계산 결과는 " + (a-c));
        else if (b.equals("*")) System.out.print(a + b + c + "의 계산 결과는 " + (a*c));
        else if (b. equals("/")) {
            if (c == 0) System.out.print("0으로 나눌 수 없습니다.");
            else System.out.print(a + b + c + "의 계산 결과는 " + (a/c));
        }

        s.close();
    }
}
