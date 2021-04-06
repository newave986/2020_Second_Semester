// Q3. Scanner 이용하여 정수를 입력받고, * 출력하는 프로그램 작성하기

import java.util.Scanner;

public class Q3_StarPrint {
    public static void main(String[] args) {

        System.out.print("정수를 입력하시오>>");

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) 
                System.out.print("*");
            System.out.println();
        }

        s.close();
    }
}
