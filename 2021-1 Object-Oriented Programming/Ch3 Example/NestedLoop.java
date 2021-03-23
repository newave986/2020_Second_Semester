/*
3-3. NestedLoop.java
2중 중첩 for문을 이용하여 구구단 출력하는 프로그램 작성.
한 줄에 한 단씩 출력.
*/

public class NestedLoop {
    public static void main (String[] args) {

        for(int i = 1; i < 10; i++) {
            for(int j = 1; j < 10; j++) {
                System.out.print(i + "*" + j + "=" + i*j + " ");
                // 뒤에 " " 넣지 않고,
                // System.out.print("\t");
                // 이 식으로 하나씩 탭으로 띄는 코드를 넣을 수 있다.
            }
            System.out.print("\n");
        } 

    }

}
