// Q16. 컴퓨터가 독자와 가위바위보를 한다. 독자의 패는 입력하고, 컴퓨터의 패는 랜덤으로 뽑는다.
// VSCode에 한국어 패치 안 깔아서 ㅎㅎ rock-paper-scissors로 바꾸어서 코드 작성함. 그만은 stop으로.

import java.util.Scanner;

public class Q16_VsComputer {
    public static void main(String[] args) {

        System.out.print("컴퓨터와 가위 바위 보 게임을 합니다.\n");

        Scanner s = new Scanner(System.in);

        String str[] = {"scissors", "rock", "paper"};

        while(true) {
            System.out.print("가위 바위 보!!>>");
            String player = s.next();

            if ("stop".equals(player)) break;
            int computer = (int)(Math.random()*3);

            if(str[computer].equals(player)) {
                System.out.print("사용자 = " + player + ", 컴퓨터 = " + str[computer] + ", 비겼습니다.\n");
            }

            else if (str[computer].equals("scissors")) {
                if (player.equals("rock")) System.out.print("사용자 = " + player + ", 컴퓨터 = " + str[computer] + ", 사용자가 이겼습니다.\n");
                else if (player.equals("paper")) System.out.print("사용자 = " + player + ", 컴퓨터 = " + str[computer] + ", 컴퓨터가 이겼습니다.\n");
            }

            else if (str[computer].equals("rock")) {
                if (player.equals("paper")) System.out.print("사용자 = " + player + ", 컴퓨터 = " + str[computer] + ", 사용자가 이겼습니다.\n");
                else if (player.equals("scissors")) System.out.print("사용자 = " + player + ", 컴퓨터 = " + str[computer] + ", 컴퓨터가 이겼습니다.\n");
            }

            else if (str[computer].equals("paper")) {
                if (player.equals("scissors")) System.out.print("사용자 = " + player + ", 컴퓨터 = " + str[computer] + ", 사용자가 이겼습니다.\n");
                else if (player.equals("rock")) System.out.print("사용자 = " + player + ", 컴퓨터 = " + str[computer] + ", 컴퓨터가 이겼습니다.\n");
            }

        }

        System.out.print("\n게임을 종료합니다...");
        s.close();
    }
    
}
