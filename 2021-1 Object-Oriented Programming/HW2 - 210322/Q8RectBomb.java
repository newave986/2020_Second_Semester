/*
Q8. RectBomb
사용자로부터 입력받은 두 점으로 구성되는 직사각형이
(100.100), (200.200)의 두 점으로 이루어진 직사각형과 충돌하는지 판별.
*/

import java.util.Scanner;

public class Q8RectBomb {

    public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
        if ((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2)) return true;
        else return false;
    }

    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);

        System.out.print("점 (x1, y1)의 좌표를 입력하시오>>");
        int x1 = s.nextInt();
        int y1 = s.nextInt();

        System.out.print("점 (x2, y2)의 좌표를 입력하시오>>");
        int x2 = s.nextInt();
        int y2 = s.nextInt();

        int status1 = inRect(x1, y1, 100, 100, 200, 200) ? 1:0;
        int status2 = inRect(x2, y2, 100, 100, 200, 200) ? 1:0;

        // 충돌할 조건은 점 하나가 직사각형 안에 있고, 
        // 나머지 점 하나는 직사각형 밖에 있는 경우이다.
        // 따라서 true-false, false-true일 때 충돌한다.
        if (status1 * status2 == 0) {
            if (status1 == 0 && status2 == 0) System.out.print("충돌하지 않는다");
            else System.out.print("충돌");
        }
        else System.out.print("충돌하지 않는다");

        s.close();

    }
}