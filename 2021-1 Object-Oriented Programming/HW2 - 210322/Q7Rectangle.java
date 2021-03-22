/* 
Q7. Retangle
(100. 100), (200. 200) 두 점으로 이루어져 있는 직사각형 안에
사용자가 입력한 점 (x, y)가 있는지 판별.
*/

import java.util.Scanner;

public class Q7Rectangle {

    public static void main(String[] arg) {

        Scanner s = new Scanner(System.in);

        System.out.print("점 (x, y)의 좌표를 입력하시오>>");
        int a = s.nextInt();
        int b = s.nextInt();

        if ((a > 100 && a < 200) && (b > 100 && b < 200)) System.out.print("(" + a + "," + b + ")는 사각형 안에 있습니다.");
        // 직사각형의 "안"은 직사각형의 윤곽을 포함하지 않으므로
        // 등호 표시를 빼 준다.

        s.close();

    }
}
