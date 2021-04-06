// Q5. 양의 정수를 10개 입력받아 배열 저장하고, 정수 중 3의 배수만 출력하기

import java.util.Scanner;

public class Q5_StoreArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] n = new int[10];

        System.out.print("양의 정수 10개를 입력하시오>>");
        for (int i = 0; i < 10; i ++) {
            n[i] = s.nextInt();
        }

        for (int i = 0; i < 10; i ++) {
            if (n[i] % 3 ==0) {
                System.out.print(n[i] + " ");
            }
        }

        s.close();
    }
}
