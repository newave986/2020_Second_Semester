// Ex 7-7.
// HashMap에 객체 저장, 학생 정보 관리
// id와 전화번호로 구성되는 Student Class를 만들고,
// 이름을 '키'로 하고 Student 객체를 '값'으로 하는 HashMap을 작성하여라.

import java.util.*;

public class Ex7_HashMapStudent {

    public static void main(String[] args) {
        HashMap<String, Student> h = new HashMap<String, Student>();

		h.put("황기태", new Student(1, "010-111-1111")); 
		h.put("이재문", new Student(2, "010-222-2222"));
		h.put("김남윤", new Student(3, "010-333-3333"));	

        Scanner scanner = new Scanner(System.in);

        String target = " ";

        while (!target.equals("exit")) {
            System.out.print("검색할 이름?");
            target = scanner.next();

            if (h.get(target) == null) System.out.println(target + "은 없는 이름입니다.");
            else {
                Student s = h.get(target);
                System.out.println("id:" + s.getId() + " 전화: " + s.getNumber());
            }
        }

        scanner.close();

    }
}
