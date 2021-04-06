// Q7. 1-10까지의 정수를 랜덤하게 생성하여 배열에 저장, 평균 출력

public class Q7_ArrayRandom {
    public static void main(String[] args) {
        System.out.print("랜덤한 정수들 : ");
        int[] array = new int[10];
        int sum = 0;
        for (int i=0; i<10; i++) {
            array[i] = (int)(Math.random()*10 + 1);
            System.out.print(array[i] + " ");
            sum += array[i];
        }
        System.out.println();
        System.out.print("평균은" + (float)sum/10);
    }
}
