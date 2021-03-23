/* 
참고 - AsciiCharInt.java
아스키코드에 의해 문자 <-> 숫자 항상 서로 변경 가능.
*/

public class AsciiCharInt {
    public static void main(String[] args) {
        char c = 'a';
        System.out.println((int) c);
        // a의 유니코드 값은 97

        int i = 98;
        System.out.println((char) i);
        // 유니코드 98은 b를 나타냄

        int j = 66;
        System.out.println((char) j);
        // 유니코드 66은 B를 나타냄
        // 유니코드로 대소문자 비교도 가능

        char ch = '가';
        System.out.println((int) ch);
        // '가'의 유니코드 값은 44032
        // 한글 또한 유니코드로 표현될 수 있음
    }
}
