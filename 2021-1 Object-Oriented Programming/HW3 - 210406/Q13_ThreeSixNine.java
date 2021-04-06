// Q13. 반복문을 이용해 369 게임의 박수 쳐야 하는 숫자를 출력하기

public class Q13_ThreeSixNine {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {

            if (i < 10) {
                if (i % 3 == 0) System.out.print(i + " 박수 짝" + "\n");
            }

            else {
                if ((i / 10) % 3 == 0) {
                    if ((i % 10) % 3 == 0) System.out.print(i + " 박수 짝짝" + "\n");
                    else System.out.print(i + " 박수 짝" + "\n");
                }
                else 
                    if ((i % 10) % 3 == 0) System.out.print(i + " 박수 짝" + "\n");
            }

        }
    }
}