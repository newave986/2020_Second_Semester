// Q1. (2) 등차수열의 합을 While 문으로 구현한다.

public class Q1_WhileTest {
    public static void main(String[] args) {
        int sum = 0, i = 0;

        while (i < 100) {
            sum = sum + i;
            i += 2;
        }
        
        System.out.println(sum);
    }
}