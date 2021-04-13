/*
04-08.
문제의 조건에 맞는 Phone 클래스를 작성하고, 예시와 같이 작동하는 PhoneBook 클래스 제작하기.
*/

import java.util.Scanner;

class Phone {

    private String name, tel;

    public Phone(String name, String tel) {
        this.name = name; this.tel = tel;
    }

    public boolean Search(String search) {
        if (search.equals(name)) return true;
        else return false;
    }
    // Search 메서드의 인자 search가 Phone의 name과 같으면 true 값을 리턴한다.

    public void Print() {
        System.out.println(name + "의 번호는 " + tel + "입니다.");
    }

}

public class Q8_PhoneBook {

    public static void main(String[] args) {

        String search;

        Scanner s = new Scanner(System.in);
        System.out.print("인원수>>");
        int n = s.nextInt();

        Phone p[] = new Phone[n];
        // PhoneBook 클래스에서 저장할 사람의 수를 입력받고,
        // Phone 객체 배열을 생성
        // 한 사람의 정보는 하나의 Phone 객체에 저장

        for (int i = 0; i < n; i++) {
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸 없이 입력)>>");

            String name = s.next();
            String tel = s.next();

            p[i] = new Phone(name, tel);
            System.out.println("저장되었습니다...");
        }

        do {
            System.out.print("검색할 이름>>");
            search = s.next();
            int status = 0;

            for (int i = 0; i < n; i ++) {

                if (status == 1) break;

                if (p[i].Search(search)) {
                    p[i].Print();
                    status = 1;
                }
            }

            if (status == 0) System.out.println(search + "이 없습니다.");

        } while (!search.equals("그만"));

        s.close();
    }

}