/*
Q11. SeasonIf
숫자를 입력받아 3~5는 봄, 6~8은 여름, 9~11은 가을, 12, 1, 2는 겨울,
그 외는 잘못 입력을 출력하는 프로그램 작성.

단, If문으로 구현할 것.
*/

import java.util.Scanner;

public class Q11SeasonIf {
    public static void main(String[] arg) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("달을 입력하세요(1~12)>>");
        int m = s.nextInt();

        if ((3 <= m) && (m <= 5)) System.out.print("봄");
        else if ((6 <= m) && (m <= 8)) System.out.print("여름");
        else if ((9 <= m) && (m <= 11)) System.out.print("가을");
        else if ((1 <= m) && (m <= 2) || (m == 12)) System.out.print("겨울");
        else System.out.print("잘못입력");

        s.close();
        
    }
}
