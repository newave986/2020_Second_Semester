/*
3-2. WhileSample.java
while문을 이용하여 정수 여러 개를 입력받고, 평균 출력.
-1이 입력되면 입력 종료.

*/

import java.util.Scanner;

public class WhileSample {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("정수를 입력하고 마지막에 -1를 입력하세요.");

        int n = s.nextInt();
        while (n != -1) {
            sum += n;
            count++;
            n = s.nextInt();
        }

        if (count==0) System.out.println("입력된 수가 없습니다.");
        else {
            System.out.print("정수의 개수는 " + count + "개이며 ");
            System.out.println("평균은 " + (double)sum/count + "입니다.");
        }
        s.close();
    }
}