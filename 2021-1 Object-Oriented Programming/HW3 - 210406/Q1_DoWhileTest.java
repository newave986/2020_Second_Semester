// Q1. (4) 등차수열의 합을 Do-While 문으로 구현한다.

public class Q1_DoWhileTest {
    public static void main(String[] args) {
        int sum = 0, i = 0;
        
        do {
            sum += i;
            i += 2;
        } while(i < 100);

        System.out.println(sum);
    }
}