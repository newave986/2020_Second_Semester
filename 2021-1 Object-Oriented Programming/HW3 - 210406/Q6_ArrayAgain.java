// Q6. 배열문과 반복문을 이용하여 동전 프로그램 작성하기

import java.util.Scanner;

public class Q6_ArrayAgain {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int[] unit = {50000, 10000, 1000, 100, 10, 1};

        System.out.print("금액을 입력하시오>>");
        int n = s.nextInt();

        int[] count = new int[6];

        for (int i = 0; i < unit.length; i++) {
            count[i] = n / unit[i];
            n -= count[i] * unit[i];
        }

        for (int i = 0; i < unit.length; i++) 
            System.out.print(unit[i] + "원 짜리 : " + count[i] + "개\n");

        s.close();
    }
}
