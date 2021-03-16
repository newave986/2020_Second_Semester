// Object Oriented Programming
// Yeseo Jang, Major in Computer Science Engineering 
// HW1 no. 2
// 210312

import java.util.Scanner;

public class IntegerOneTwo {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("2자리수 정수 입력(10~99)>>");
        int n = scanner.nextInt();

        if (n < 10 || n > 99) System.out.print("10과 99 사이의 정수를 입력하십시오.");

        else {
            int one = n / 10;
            int two = n % 10;

            if (one == two) System.out.print("Yes! 10의 자리와 1의 자리가 같습니다.");
            else System.out.print("No! 10의 자리와 1의 자리가 다릅니다.");
        }

        scanner.close();
    }

}