/*
예제 7-3. 문자열을 입력받아 ArrayList에 저장한다.

입력받은 4개 이름 중 제일 긴 이름을 출력한다.
*/

import java.util.*;

public class Ex3_ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i ++) {
            System.out.print("이름을 입력하세요>>");
            String s= scanner.next();
            a.add(s);
        }

        String max = "";

        for (int i = 0; i < a.size(); i ++) {
            String n = a.get(i);
            System.out.print(n + " ");
            if (n.length() > max.length()) max = n;
        }

        System.out.print("\n" + max);
        scanner.close();
    }
    
}
