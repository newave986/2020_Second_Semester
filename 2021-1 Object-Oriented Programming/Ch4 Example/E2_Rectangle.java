/* 
Example 04-02.

width, height 입력 받아 사각형의 합 출력하는 프로그램 작성
width, height 필드 / getArea() 메소드를 가진 Rectangle 클래스 만들어 활용
*/

import java.util.Scanner;

public class E2_Rectangle {
    int width;
    int height;

    // 기본 생성자 없음
    // 따로 작성하지 않아도 기본적으로 만들어짐
    
    public int getArea() {
        return width*height;
    }

    public static void main(String[] args) {
        E2_Rectangle rect = new E2_Rectangle();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print(">>");
        rect.width = scanner.nextInt();
        rect.height = scanner.nextInt();

        System.out.print("사각형의 면적은 " + rect.getArea());

        scanner.close();
    }
}
