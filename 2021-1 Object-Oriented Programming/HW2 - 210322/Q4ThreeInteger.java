/* 
Q4. ThreeInteger
정수 3개를 입력받고, 3개의 숫자 중 중간 크기의 수를 출력.
*/

import java.util.Scanner;

public class Q4ThreeInteger {
    public static void main(String[] ars) {
        Scanner s = new Scanner(System.in);

        System.out.print("정수 3개 입력:");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        if (b <= a) {
            if (a <= c) System.out.print("중간 값은 " + a);
            else if (c <= b) System.out.print("중간 값은 " + b);
            else if (c <= a) System.out.print("중간 값은 " + c);
        }

        else { // == else if (b > a)
            if (c <= a) System.out.print("중간 값은 " + a);
            else if (b <= c) System.out.print("중간 값은 " + b);
            else if (c <= b) System.out.print("중간 값은 " + c);
        }
        
        s.close();
    }
}
