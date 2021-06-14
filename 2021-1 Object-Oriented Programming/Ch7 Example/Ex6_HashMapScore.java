// Ex 7-6. 
// HashMap을 이용하여 자바 과목의 이름과 점수를 관리한다.

import java.util.*;

public class Ex6_HashMapScore {
    public static void main(String[] args) {

        HashMap<String, Integer> h = new HashMap<String, Integer>();

		h.put("김성동", 97);
		h.put("황기태", 88);
		h.put("김남윤", 98);
		h.put("이재문", 70);
		h.put("한원선", 99);

        System.out.println("HashMap의 요소 개수: " + h.size());

        Set<String> keys = h.keySet(); // key 문자열을 가진 집합 set collection return
        Iterator<String> it = keys.iterator(); // key 문자열을 순서대로 접근할 수 있는 Iterator return

        while(it.hasNext()) {
            String name = it.next();
            int score = h.get(name);
            System.out.println(name + ":" + score);
        }
    }
}
