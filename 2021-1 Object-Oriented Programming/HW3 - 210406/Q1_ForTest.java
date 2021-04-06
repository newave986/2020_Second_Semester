// Q1. (3) 등차수열의 합을 For 문으로 구현한다.

public class Q1_ForTest {
    public static void main(String[] args) {
        int sum = 0, i = 0;
        for (i = 0; i < 100; i += 2)
            sum += i;
        System.out.println(sum);
    }
}