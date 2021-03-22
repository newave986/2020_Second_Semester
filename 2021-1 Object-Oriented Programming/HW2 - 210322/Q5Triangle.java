/*
Q5. Triangle
삼각형 변의 길이를 나타내는 정수 3개 입력받고, 이들이 삼각형을 만들 수 있는지 판별.
*/


import java.util.Scanner; 

class Q5Triangle {
    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);

        System.out.print("정수 3개를 입력하시오>>");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        if ((b < a) && (c < a)) {
            if (a < b + c) System.out.print("삼각형이 됩니다");
            else System.out.print("삼각형이 되지 않습니다");
        }

        else if ((a < b) && (c < b)) {
            if (b < a + c) System.out.print("삼각형이 됩니다");
            else System.out.print("삼각형이 되지 않습니다");
        }
        
        else { // else if ((a < c) && (b < c))
            if (c < a + b) System.out.print("삼각형이 됩니다");
            else System.out.print("삼각형이 되지 않습니다");
        }

        s.close();
    }
}