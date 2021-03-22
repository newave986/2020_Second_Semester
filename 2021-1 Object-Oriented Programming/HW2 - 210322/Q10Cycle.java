/*
Q10. Cycle
두 개의 원을 입력받고, 두 원이 서로 겹치는지 판별.
*/

import java.util.Scanner;

public class Q10Cycle {
    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);

        System.out.print("첫 번째 원의 중심과 반지름 입력>>");
        int x1 = s.nextInt();
        int y1 = s.nextInt();
        int r1 = s.nextInt();

        System.out.print("두 번째 원의 중심과 반지름 입력>>");
        int x2 = s.nextInt();
        int y2 = s.nextInt();
        int r2 = s.nextInt();

        double distance = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));

        if (distance < (r1 + r2)) System.out.print("두 원은 서로 겹친다.");
        else System.out.print("두 원은 서로 겹치지 않는다.");

        s.close();
    }
}
