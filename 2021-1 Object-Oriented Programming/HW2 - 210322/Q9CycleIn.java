/*
Q9. CycleIn
입력받은 원에 입력받은 점 (x, y)가 속하는지 판별.
*/

import java.util.Scanner;

public class Q9CycleIn {

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("원의 중심과 반지름 입력>>");
        double c1 = s.nextDouble();
        double c2 = s.nextDouble();
        double r = s.nextDouble();
    
        System.out.print("점 입력>>");
        double x = s.nextDouble();
        double y = s.nextDouble();

        double distance = Math.sqrt(Math.pow((x - c1), 2) + Math.pow((y - c2), 2));

        if (distance < r) {
            // "안(내부)"는 경계를 포함하지 않으므로 등호를 넣어 주지 않는다.
            System.out.print("점 (" + x + ", " + y + ")는 원 안에 있다.");
        }
        else System.out.print("점 (" + x + ", " + y + ")는 원 안에 있지 않다.");

        s.close();
    }
    
}
