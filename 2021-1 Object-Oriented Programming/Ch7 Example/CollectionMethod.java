// 컬렉션을 매개변수로 받는 메소드를 만든다.
// 컬렉션을 매개변수로 받는 메소드의 원형: public void printVector(Vector<Integer> v)

import java.util.Vector;

public class CollectionMethod {
    public static void printVector(Vector<Integer> v) {
        for (int i = 0; i < v.size(); i ++) {
            int n = v.get(i);
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        printVector(v); // method 호출
    }
}
