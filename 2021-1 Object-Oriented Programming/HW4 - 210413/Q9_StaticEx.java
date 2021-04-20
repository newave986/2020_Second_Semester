/*
04-09.
두 개의 static을 가진 ArrayUtil 클래스를 문제의 조건에 따라 만든다.
예시와 같이 출력하는 concat() 메소드와 print() 메소드를 작성하여 완성한다.
*/

class ArrayUtil {

    public static int[] concat(int[] a, int[] b) {

        final int len = a.length + b.length;
        int[] newArray = new int[len];

        for (int i = 0; i < a.length; i ++) newArray[i] = a[i];
        for (int i = 0; i < b.length; i ++) newArray[a.length + i] = b[i];

        return newArray;
    } // 배열 a와 b를 연결한 새로운 배열을 리턴한다.

    public static void print(int[] a) {
        System.out.print("[ ");
        for (int i = 0; i < a.length; i ++) System.out.print(a[i] + " ");
        System.out.print("]");
    } // 배열 a 출력
}


public class Q9_StaticEx {

    public static void main(String[] args) {

        int[] array1 = {1, 5, 7, 9};
        int[] array2 = {3, 6, -1, 100, 77};
        int[] array3 = ArrayUtil.concat(array1, array2);

        ArrayUtil.print(array3);
    }
}