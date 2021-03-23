/*
3-3. DoWhileSample.java
do-while문 이용하여 'a'부터 'z'까지 출력.

do-while문은 최소 1번 do 안의 작업문이 반복된다.
그 후 반복 여부는 while 안의 조건식이 충족되느냐에 따라 다르다.
*/

public class DoWhileSample {
    public static void main(String[] args) {
        char c = 'a';

        do {
            System.out.print(c);
            c = (char)(c + 1);
        } while (c <= 'z');
    }
}
