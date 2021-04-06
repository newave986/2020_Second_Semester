// Q8. 배열의 크기를 입력받고, 정수를 랜덤으로 삽입하여 배열을 출력

import java.util.Scanner;

public class Q8_IntArrayRan {                                                                                                                                                         

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("정수 몇 개?");
        int n = s.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = (int)(Math.random()*100 + 1);

            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    array[i] = (int)(Math.random()*100 + 1);
                }
            }
            System.out.print(array[i] + " ");
        }

        s.close();
    }
}
