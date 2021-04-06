// Q14. 과목과 점수가 짝을 이루어 과목 이름과 점수가 출력되도록 하는 프로그램 작성.
// 예시에는 한글로 나와 있으나 모두 영어로(Stop) 구현하였습니다.

import java.util.Scanner;

public class Q14_CourseScore {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String course[] = { "Java", "C++", "HTML5", "ComputerArchitecture", "Android" };
        int score[] = {95, 88, 76, 62, 55};

        while(true) {

            System.out.print("과목 이름>>");
            String name = s.next();

            if ("Stop".equals(name)) break;
            
            for (int i = 0; i < course.length; i++) {
                if (course[i].equals(name)) {
                    int n = score[i];
                    System.out.print(name + "의 점수는 " + n + "\n");
                    i = course.length + 1;
                }
                if (i == course.length) System.out.print("\n없는 과목입니다.\n");
            }

        }

        s.close();
        
    }
}