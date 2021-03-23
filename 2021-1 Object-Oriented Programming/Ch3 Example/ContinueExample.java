/*
3-5. ContinueExample.java
5개의 정수를 입력받고, 그 중 양수들만 합하여 출력하는 프로그램 작성.

"Continue" 반복문을 빠져 나가지 않으면서 다음 반복으로 진행함.
반복 후 돌아가는 위치를 정확히 고려해 주어야 함.

- for문의 경우: <반복 후 작업>으로 돌아감
    for(초기문; 조건식; 반복 후 작업) {}
- while문의 경우: <조건식>으로 돌아감
- do-while문의 경우: <조건식>으로 돌아감
*/

import java.util.Scanner;

public class ContinueExample {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("정수를 5개 입력하세요.");
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            int n = s.nextInt();
            if (n <= 0) continue;
            // 양수가 아닌 경우 다음 반복으로 진행
            else sum += n;
        }

        System.out.println("양수의 합은 " + sum);

        s.close();
    }
}
