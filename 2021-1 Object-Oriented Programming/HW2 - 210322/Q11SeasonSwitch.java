/*
Q11. SeasonSwitch
숫자를 입력받아 3~5는 봄, 6~8은 여름, 9~11은 가을, 12, 1, 2는 겨울,
그 외는 잘못 입력을 출력하는 프로그램 작성.

단, Switch문으로 구현할 것.
*/

import java.util.Scanner;

public class Q11SeasonSwitch {
    public static void main(String[] arg) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("달을 입력하세요(1~12)>>");
        int m = s.nextInt();

        switch (m) {
            case 3: case 4: case 5:
                System.out.print("봄");
                break;
            case 6: case 7: case 8:
                System.out.print("여름");
                break;
            case 9: case 10: case 11:
                System.out.print("가을");
                break;
            case 12: case 1: case 2:
                System.out.print("겨울");
                break;
            default:
                System.out.print("잘못입력");
                break;
        }

        s.close();
    }
}
