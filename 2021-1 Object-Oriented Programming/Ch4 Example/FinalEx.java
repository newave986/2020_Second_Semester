class SharedClass {
    public static final double PI = 3.14;
}

public class FinalEx {
    final int ROWS= 10;

    void f() {
        int[] intArray = new int[ROWS];
        // ROWS = 30; 처럼 final 값을 변경하려고 하면 오류 발생
    }
}
