/*
04-07.
하루의 할 일을 표현하는 주어진 클래스 Day를 이용하여
한 달의 할 일을 표현하는 MonthSchedule 클래스를 작성하여라.
- 한 클래스에서 다른 클래스의 배열 만들기
*/

import java.util.Scanner;

class Day {
    private String work; // 하루의 할 일을 나타내는 문자열
    public void set(String work) { this.work = work; }
    public String get() { return work; }
    public void show() {
        if (work == null) System.out.println("없습니다.");
        else System.out.println(work + "입니다.");
    }
}

public class Q7_MonthSchedule {

    public static Scanner s = new Scanner(System.in);

    public static int status, date, num;
    public static Day[] d;

    Q7_MonthSchedule(int num) {
        this.d = new Day[num];
        for (int i = 0; i < num; i ++) d[i] = new Day();
    } // 생성자 선언

    public void input() {
        System.out.print("할일(빈칸없이입력)?");
        String plan = s.next();
        d[date].set(plan);
    } // 할 일을 입력하는 메소드 input() 선언

    public void view() {
        System.out.print(date + "일의 할 일은 ");
        d[date].show();
    } // 할 일을 조회하는 메소드 view() 선언

    public void finish() {
        System.out.println("프로그램을 종료합니다.");
    } // 프로그램을 종료하는 메소드 finish() 선언

    public void run() {

        while(true) {
            System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
            status = s.nextInt();

            switch(status) {
                case(1): 
                System.out.print("날짜(1~30)?"); date = s.nextInt();
                input(); break;

                case(2): 
                System.out.print("날짜(1~30)?"); date = s.nextInt();
                view(); break;

                case(3): finish(); return;
            }

            System.out.println();
        }
    } // 메뉴를 출력하고 처리하는 메소드 run() 선언

    public static void main(String[] args) {
        Q7_MonthSchedule april = new Q7_MonthSchedule(30);
        System.out.println("이번달 스케쥴 관리 프로그램.");
        april.run();
        s.close();
    } // main method
}