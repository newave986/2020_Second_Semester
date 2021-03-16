// Object Oriented Programming
// Yeseo Jang, Major in Computer Science Engineering 
// HW1 no. 1
// 210312

import java.util.Scanner;

public class WonToDollar {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("원화를 입력하세요(단위 원)>>");
        int won = scanner.nextInt();
        double exchangeRate = 1100;

        double dollar = won / exchangeRate;

        System.out.print(won + "원은 $" + dollar + "입니다.");

        scanner.close();
    }

}