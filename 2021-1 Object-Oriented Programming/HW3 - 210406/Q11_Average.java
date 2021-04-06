// Q11. 정수를 입력받아 그 정수들의 평균을 출력하는 클래스 Average.java를 만들기.

public class Q11_Average {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 0; i < args.length; i++) {
            int n = Integer.parseInt(args[i]);
            sum += n;
        }

        System.out.print((float) sum/args.length);

    }

}
