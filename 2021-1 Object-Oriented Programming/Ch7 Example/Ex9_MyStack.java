// ex 7-9. 제네릭 스택 만들기
// 스택을 제네릭 클래스로 작성하고, String과 Integer형 스택을 사용하는 예를 보이시오.

public class Ex9_MyStack {
    public static void main(String[] args) {
        GStack<String> stringStack = new GStack<String>();
        stringStack.push("seoul");
        stringStack.push("busan");
        stringStack.push("LA");

        for (int n = 0; n < 3; n ++) System.out.println(stringStack.pop());

        GStack<Integer> intStack = new GStack<Integer>();

        intStack.push(1);
        intStack.push(2);
        intStack.push(3);

        for (int n = 0; n<3; n++) System.out.println(intStack.pop());
    }
}
