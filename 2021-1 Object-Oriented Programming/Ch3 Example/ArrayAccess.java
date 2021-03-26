/* 
3-7. ArrayAccess.java

양수 5개를 입력받아 배열에 저장. 제일 큰 수 출력 프로그램.
*/


import java.util.Scanner;

public class ArrayAccess {
    
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int intArray[] = new int[5];

        int max = 0;
        System.out.println("양수 5개를 입력하세요.");

        for (int i = 0; i < 5; i++) {
            intArray[i] = s.nextInt();
            if (intArray[i] > max) max = intArray[i];
        }
        
        System.out.print("가장 큰 수는 " + max + "입니다.");

        s.close();

    }

}
