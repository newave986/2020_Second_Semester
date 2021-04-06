// Q4. 소문자 알파벳을 하나 입력받고, 그 알파벳까지를 모두 출력하기.

import java.util.Scanner;

public class Q4_Alphabet {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("소문자 알파벳 하나를 입력하시오>>");
        String x = s.next();
        char c = x.charAt(0);

        for (int i = (int)c; i >= 97; i--) {
            for (int j = 97; j <= i; j++) {
                System.out.print((char) j);
            }
            System.out.println();
        }

        s.close();
    }
}
