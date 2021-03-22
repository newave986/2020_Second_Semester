/*
Q3. WonWonWon
정수로 된 돈의 액수를 입력받아 오만 원권, 만 원권, 천 원권, 
500원짜리 동전, 100원짜리 동전, 50원짜리 동전, 10원짜리 동전, 1원짜리 동전 각 몇 개로 변환되는지 출력.
*/

import java.util.Scanner;

public class Q3WonWonWon {
    
    public static void main (String[] arg) {

        Scanner s = new Scanner(System.in);
        System.out.print("금액을 입력하시오>>");
        int won = s.nextInt();

        int one = (won / 10000) / 5; // 오만 원권
        int two = (won / 10000) - 5 * one; // 만 원권
        int three = (won % 10000) / 1000; // 천 원권
        int four = (won % 1000) / 500; //오백 원권
        int five = (won % 1000) / 100 - four * 5; // 백 원권
        int six = (won % 100) / 50; // 오십 원권
        int seven = (won % 100) / 10 - six * 5; // 십 원권
        int eight = (won % 10); // 일 원권

        //오만 원권
        if (one != 0) System.out.println("오만원권 " + one + "매");

        // 만 원권
        if (two != 0) System.out.println("만원권 " + two + "매");

        // 천 원권
        if (three != 0) System.out.println("천원권 " + three + "매");

        //오백 원권
        if (four != 0) System.out.println("오백원 " + four + "개");

        // 백 원권
        if (five != 0) System.out.println("백원 " + five + "개");

        // 오십 원권
        if (six != 0) System.out.println("오십원 " + six + "개");

        // 십 원권
        if (seven != 0) System.out.println("십원 " + seven + "개");

        // 일 원권
        if (eight != 0) System.out.println("일원 " + eight + "개");

        s.close();

    }
}
