/*
Q12. CalculateSwitch
실수와 사칙 연산을 입력 받아 계산하는 계산기 제작.

단, Switch문을 이용할 것.
*/

import java.util.Scanner;

public class Q12CalculateSwitch {
    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);
        System.out.print("연산>>");
        double a = s.nextDouble();
        String b = s.next();
        double c = s.nextDouble();
        
        switch (b) {
            
            case "+": 
            System.out.print(a + b + c + "의 계산 결과는 " + (a+c));
            break;
            
            case "-":
            System.out.print(a + b + c + "의 계산 결과는 " + (a-c));
            break;

            case "*":
            System.out.print(a + b + c + "의 계산 결과는 " + (a*c));
            break;

            case "/":
            if (c == 0) System.out.print("0으로 나눌 수 없습니다.");
            else System.out.print(a + b + c + "의 계산 결과는 " + (a/c));
            break;

        }

        s.close();
    }
}