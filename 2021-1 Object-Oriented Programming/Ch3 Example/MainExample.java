/* Main Example

cmd 창 접속
- javac MainExample.java
- java MainExample 1 2 3
*/

public class MainExample {
    public static void main(String[] args) {
        System.out.println(args[0] + args[1]);
        System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
    }
}