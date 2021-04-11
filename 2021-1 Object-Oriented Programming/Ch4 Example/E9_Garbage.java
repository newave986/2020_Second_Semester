/*
04-09.

가비지 발생 예제
*/

public class E9_Garbage {
    public static void main(String[] args) {
        String a = new String("Good");
        String b = new String("Bad");
        String c = new String("Normal");
        String d, e;
        a = null;
        d = c;
        c = null;

        System.gc();
    }
}