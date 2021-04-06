// Q10. 4x4의 2차원 배열을 만들고 랜덤한 10개의 정수를 10개의 랜덤한 위치에 삽입. 나머지 6개의 숫자는 모두 0.

public class Q10_TwoDimRan {
    public static void main(String[] args) {

        int[][] array = new int[4][4];
        // new int로 메모리를 할당해 주면 모든 초기값이 0으로 설정되므로
        // 6개의 자리에 0이 되는 것은 고려해 주지 않아도 된다.

        int[] position = new int[10];
        // 포지션 리스트에 10개의 자리를 넣는다.

        for (int i = 0; i < 10; i ++) {
            position[i] = (int)(Math.random()*16 + 1);
            for (int j = 0; j < i; j ++) {
                if (position[i] == position[j]) {
                    position[i] = (int)(Math.random()*16);
                }
            }

            int one = position[i] / 4;
            int two = position[i] % 4;

            array[one][two] = (int)(Math.random()*10 + 1);
        }

        for (int i = 0; i < 4; i ++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%-10d", array[i][j]);
            }
            System.out.println();
        }
    }
}
