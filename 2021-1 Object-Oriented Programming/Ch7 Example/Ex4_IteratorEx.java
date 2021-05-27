/*
Example 7-4.
Iterator 사용하여 Ex1 코드를 수정
*/

import java.util.*;

public class Ex4_IteratorEx {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();

        v.add(5);
        v.add(4);
        v.add(-1);

        v.add(2, 100);

        System.out.println("벡터 내의 요소 객체 수 : " + v.size());
        System.out.println("벡터의 현재 용량 : " + v.capacity());

        Iterator<Integer> it = v.iterator();

        int sum = 0;

        while(it.hasNext()) {
            int n = it.next();
            System.out.println(n);
            sum += n;
        }
        
        System.out.println("벡터에 있는 정수 합 : " + sum);
    }
}
