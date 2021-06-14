// Ex 7-5.
// HashMap 이용하여 (영어, 한글) 단어 쌍의 저장을 검색한다.
// (영어, 한글) 단어를 쌍으로 HashMap에 저장하고, 영어를 한글로 검색하는 프로그램을 작성.
// "exit" 입력 시 프로그램 종료됨.

import java.util.*;

public class Ex5_HashMap {
    public static void main(String[] args) {
        HashMap<String, String> h = new HashMap<String, String>();
        h.put("baby", "아기");
        h.put("love", "사랑");
        h.put("apple", "사과");

        Scanner s = new Scanner(System.in);
        
        String target = " ";

        do {
            System.out.print("찾고 싶은 단어는?");
            target = s.next();
            if (h.get(target) == null) System.out.println(target + "은 없는 단어 입니다.");
            else System.out.println(h.get(target));
        } while (!(target.equals("exit")));

        System.out.println("종료합니다...");

        s.close();
    }
}
