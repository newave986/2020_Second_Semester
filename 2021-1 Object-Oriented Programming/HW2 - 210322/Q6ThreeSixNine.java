/*
Q6. ThreeSixNine
1~99까지의 정수를 이용하여 간단한 369 게임 작성.
*/

import java.util.Scanner;

public class Q6ThreeSixNine {
    public static void main(String[] arg) {
         
        Scanner s = new Scanner(System.in);
        System.out.print("1~99 사이의 정수를 입력하시오>>");
        int n = s.nextInt();

        if (n < 10) {
            if (n % 3 == 0) System.out.print("박수짝");
        }

        else {
            int a = n / 10;
            int b = n % 10;

            if (a % 3 == 0) {
                if (b % 3 == 0) System.out.print("박수짝짝");
                else System.out.print("박수짝");
            }

            else if ((b != 0) && (b % 3 == 0)) System.out.print("박수짝");            
        }

        s.close();

    }
}
