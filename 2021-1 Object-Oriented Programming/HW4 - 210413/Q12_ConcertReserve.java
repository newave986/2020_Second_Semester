/*
04-12.
간단한 콘서트 예약 시스템 만들어 보기.
*/

import java.util.Scanner;

class S_Seat {

    public String[] s = {"---", "---", "---", "---", "---",
                         "---", "---", "---", "---", "---" };

    public void reserve(String name, int seat) {
        if (s[seat-1] == "---") s[seat-1] = name; 
        else {
            System.out.println("이미 예약되어 있는 좌석입니다. 다른 좌석을 선택하세요.");
        }
    } // name과 seat를 입력받아 새로운 예약을 성사시키는 메소드 reserve
    
    public void show() { 
        System.out.print("S>> ");
        for (int i = 0; i < 10; i ++) System.out.print(s[i] + " ");
        System.out.println();
    } // 현재 좌석 현황을 보여 주는 메소드 show

    public void cancel(String name) {
        int status = 0;

        for (int i = 0; i < 10; i ++) {
            if (name.equals(s[i])) {
                s[i] = "---";
                i = 10;
                status = -1;
            }
        }
        if (status == 0) System.out.println("없는 이름입니다. 다시 시도하세요."); 
        // 없는 이름을 입력했을 경우에는 오류 메시지 출력해 줌
    } // name을 입력받아 예약을 취소하는 메소드 cancel

} // S열의 좌석 메서드 S_Seat를 선언한다.

class A_Seat {

    public String[] a = {"---", "---", "---", "---", "---",
                         "---", "---", "---", "---", "---" };

    public void reserve(String name, int seat) { 
        if (a[seat-1] == "---") a[seat-1] = name; 
        else {
            System.out.println("이미 예약되어 있는 좌석입니다. 다른 좌석을 선택하세요.");
        }
    }
    
    public void show() { 
        System.out.print("A>> ");
        for (int i = 0; i < 10; i ++) System.out.print(a[i] + " ");
        System.out.println();
    }

    public void cancel(String name) {
        int status = 0;
        for (int i = 0; i < 10; i ++) {
            if (name.equals(a[i])) {
                a[i] = "---";
                i = 10;
                status = -1;
            }
        }
        if (status == 0) System.out.println("없는 이름입니다. 다시 시도하세요."); 
        // 없는 이름을 입력했을 경우에는 오류 메시지 출력해 줌
    }
} // S열의 좌석 메서드 S_Seat와 같은 메서드들을 가지고 있는 A_Seat 메서드를 선언한다.

class B_Seat {

    public String[] b = {"---", "---", "---", "---", "---",
                         "---", "---", "---", "---", "---" };

    public void reserve(String name, int seat) { 
        if (b[seat-1] == "---") b[seat-1] = name; 
        else {
            System.out.println("이미 예약되어 있는 좌석입니다. 다른 좌석을 선택하세요.");
        }
    }
    
    public void show() { 
        System.out.print("B>> ");
        for (int i = 0; i < 10; i ++) System.out.print(b[i] + " ");
        System.out.println();
    }

    public void cancel(String name) {
        int status = 0;
        for (int i = 0; i < 10; i ++) {
            if (name.equals(b[i])) {
                b[i] = "---";
                i = 10;
                status = -1;
            }
        }
        if (status == 0) System.out.println("없는 이름입니다. 다시 시도하세요."); 
        // 없는 이름을 입력했을 경우에는 오류 메시지 출력해 줌
    }
} // S열의 좌석 메서드 S_Seat와 같은 메서드들을 가지고 있는 B_Seat 메서드를 선언한다.

public class Q12_ConcertReserve {

    public static Scanner scanner = new Scanner(System.in);

    S_Seat sS = new S_Seat();
    A_Seat aS = new A_Seat();
    B_Seat bS = new B_Seat();
    // S, A, B seat를 각각 만들어 준다.

    public void reserve() {

        String name;
        int seat; 

        System.out.print("좌석구분 S(1), A(2), B(3)>>>");
        int n = scanner.nextInt();
        switch (n) { 
            // switch문으로 S, A, B 시트 각각에 대하여 예약을 진행한다.
            case 1: 
            sS.show();
            System.out.print("이름>>");
            name = scanner.next();
            System.out.print("번호>>");
            seat = scanner.nextInt();
            if (seat < 1 || seat > 10) {
                System.out.println("없는 번호입니다. 다시 시도하십시오."); 
                run();
            }
            else sS.reserve(name, seat);
            break;

            case 2: 
            aS.show();
            System.out.print("이름>>");
            name = scanner.next();
            System.out.print("번호>>");
            seat = scanner.nextInt();
            if (seat < 1 || seat > 10) {
                System.out.println("없는 번호입니다. 다시 시도하십시오."); 
                run();
            }
            else aS.reserve(name, seat);
            break;

            case 3:
            bS.show();
            System.out.print("이름>>");
            name = scanner.next();
            System.out.print("번호>>");
            seat = scanner.nextInt();
            if (seat < 1 || seat > 10) {
                System.out.println("없는 번호입니다. 다시 시도하십시오."); 
                run();
            }
            else bS.reserve(name, seat);
            break;

            default:
            System.out.println("없는 좌석입니다. 다시 시도하십시오.");
            run();
            break;
        }
    } // S, A, B 시트의 예약을 가능하게 하는 reserve() 메서드를 선언한다.

    public void show() {
        sS.show();
        aS.show();
        bS.show();
        System.out.println("<<<조회를 완료하였습니다.>>>");
    } // 현재 S, A, B 시트의 좌석 현황을 조회하는 show() 메서드를 선언한다.

    public void cancel() {
        String name;

        System.out.print("좌석 S:1, A:2, B:3>>>");
        int n = scanner.nextInt();
        switch (n) {
            // switch문으로 S, A, B 시트 각각에 대하여 예약 취소를 진행한다.
            case 1: 
            sS.show();
            System.out.print("이름>>");
            name = scanner.next();
            sS.cancel(name);
            break;

            case 2: 
            aS.show();
            System.out.print("이름>>");
            name = scanner.next();
            aS.cancel(name);
            break;

            case 3:
            bS.show();
            System.out.print("이름>>");
            name = scanner.next();
            bS.cancel(name);
            break;

            default:
            System.out.println("없는 좌석입니다. 다시 시도하십시오.");
            run();
            break;
        }
    } // S, A, B 시트의 예약 취소 역할을 하는 cancel() 메서드를 선언한다.

    public void run() {

        while(true) {
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
            int n = scanner.nextInt();

            switch (n) {
                case 1: reserve(); break;
                case 2: show(); break;
                case 3: cancel(); break;
                case 4: return;
                default:
                System.out.println("없는 선택지입니다. 다시 시도하십시오.");
                run();
                break;
            }
        }
    } // 예약, 조회, 취소, 종료 중 사용자가 원하는 옵션을 실행시키는 run() 메서드를 선언한다.
    
    public static void main(String[] args) {
        Q12_ConcertReserve re = new Q12_ConcertReserve();
        System.out.println("명품콘서트홀 예약 시스템입니다.");
        re.run();
        scanner.close(); 
    } // main 메서드를 선언한다.
}