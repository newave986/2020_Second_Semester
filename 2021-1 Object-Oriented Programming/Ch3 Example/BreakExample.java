/*
3-6. BreakExample.java
"exit"이 입력되면 while문을 벗어나도록 break문 활용하는 프로그램 작성.
*/

import java.util.Scanner;

public class BreakExample {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(true) {
            System.out.print(">>");
            String text = s.nextLine();
            if (text.equals("exit")) break;
            // string1.equals("string2");
            // string1 == string2 이면 true 리턴하는 함수 equals.
        }
        System.out.println("종료합니다.");

        s.close();
    }
}
