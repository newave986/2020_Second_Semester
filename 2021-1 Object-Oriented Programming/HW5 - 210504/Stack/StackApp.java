import java.util.Scanner;

public class StackApp extends StringStack {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("총 스택 저장 공간과 크기 입력 >> ");
        int stackSize = s.nextInt();

        StringStack myStack = new StringStack(stackSize);

        String inputString = s.nextLine();

        while(!inputString.equals("그만")) {
            System.out.print("문자열 입력 >> ");
            inputString = s.nextLine();
            if (myStack.capacity() != 0) myStack.push(inputString);
            else System.out.println("스택이 꽉 차서 푸시 불가!");
        }

        System.out.print("스택에 저장된 모든 문자열 팝 : ");
        while (myStack.stackNow != 0) System.out.print(myStack.pop() + " ");
    }
}
