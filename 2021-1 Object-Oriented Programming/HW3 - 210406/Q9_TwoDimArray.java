// Q9. 4x4의 2차원 배열 만들고, 16개의 정수를 랜덤으로 저장해 출력

public class Q9_TwoDimArray {
    public static void main(String[] args) {

        int[][] array = new int[4][4];

        for (int i = 0; i < 4; i ++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = (int)(Math.random()*100 + 1);
                System.out.printf("%-10d", array[i][j]);
            }
            System.out.println();
        }

    }
}
