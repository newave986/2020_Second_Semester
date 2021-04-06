// Q15. 실수를 입력하면 정수를 입력하도록 오류를 정정하는 수정된 Multiply 함수 만들기

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q15_MultiplyModify {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = 0;
        int m = 0;
        boolean b = false;

        do {
            try {
                System.out.print("\n곱하고자 하는 두 수 입력>>");
                n = s.nextInt();
                m = s.nextInt();
                b = false;
            }
            catch(InputMismatchException e) {
                System.out.print("실수는 입력하면 안됩니다.");
                s.nextLine();
                b = true;
            }
        } while(b);

        System.out.print(n + "x" + m + "=" + n*m);
        s.close();

    }
}
