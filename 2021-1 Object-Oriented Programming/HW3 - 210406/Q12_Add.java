// Q12. 명령형 인자 중 정수만 골라 합을 구하는 Add.java 프로그램 작성.

public class Q12_Add {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 0; i < args.length; i++) {

            try { 
                int n = Integer.parseInt(args[i]);
                sum += n;
            }
            catch (NumberFormatException e) {
                ;
            }
            
        }

        System.out.print(sum);

    }

}
