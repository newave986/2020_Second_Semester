/*
참고 - EscapeBackslash.java
만약 "를 출력하고 싶다면, 그냥 """ 이렇게 쓰면 오류가 남.
    → \ backslash를 쓰고 싶은 " 앞에 쓰면 그냥 "가 출력됨. : \"
*/

public class EscapeBackslash {

    public static void main (String[] args) {

        System.out.println("\"");
        System.out.println("\"안녕하세요\"");

        System.out.println("\n");
    }

}
