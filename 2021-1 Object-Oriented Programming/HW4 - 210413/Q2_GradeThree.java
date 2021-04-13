/*
04-02.
Grade 클래스를 작성 - 세 과목의 점수를 입력받아 Grade 객체를 생성하고, 성적 평균을 출력하는 average 클래스 생성.
*/

import java.util.Scanner;

public class Q2_GradeThree {

    private int math;
    private int science;
    private int english;

    public Q2_GradeThree(int math, int science, int english) {
        this.math = math;
        this.science = science;
        this.english = english;
    }

    public double average() {
        return (math + science + english) / 3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
        int math = scanner.nextInt();
        int science = scanner.nextInt();
        int english = scanner.nextInt();
        Q2_GradeThree me = new Q2_GradeThree(math, science, english);
        System.out.println("평균은 " + me.average()); // average()는 평균을 계산하여 리턴

        scanner.close();
    }
}