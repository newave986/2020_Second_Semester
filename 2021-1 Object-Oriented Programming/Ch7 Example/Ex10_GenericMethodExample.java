// Ex 7-10. 스택의 내용을 반대로 만드는 제너릭 메소드 만들기
// 예제 9번의 GStack을 이용하여 주어진 스택의 내용을 반대로 만드는 제네릭 메소드 reverse()을 작성할 것.

public class Ex10_GenericMethodExample {
	public static <T> GStack<T> reverse(GStack<T> a) { 	
		GStack<T> s = new GStack<T>(); 
		while (true) {
			T tmp; 
			tmp = a.pop(); 
			if (tmp==null) 
				break;
			else 
				s.push(tmp); 
		}
		return s; 
	}

    public static void main(String[] args) {
        GStack<Double> gs = new GStack<Double>();

        for (int i = 0; i < 5; i++) {
            gs.push(new Double(i));
        }
        gs = reverse(gs);
        for (int i = 0; i < 5; i++) System.out.println(gs.pop());
    }
}
