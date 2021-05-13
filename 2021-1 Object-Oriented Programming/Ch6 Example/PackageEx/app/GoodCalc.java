package PackageEx.app;
import PackageEx.lib.Calculator;
// Calculator Class 사용하기 위해서는
// 패키지를 포함하는 정확한 경로명을
// 컴파일러에게 알려 줌

public class GoodCalc extends Calculator {
	public int add(int a, int b) {
		return a+b;
	}
	public int subtract(int a, int b) {
		return a - b;
	}
	public double average(int[] a) {
		double sum = 0;
		for (int i = 0; i < a.length; i++) 
			sum += a[i];
		return sum/a.length;
	}
	public static void main(String [] args) {
		Calculator c = new GoodCalc();
		System.out.println(c.add(2,3));
		System.out.println(c.subtract(2,3));
		System.out.println(c.average(new int [] {2,3,4 }));
	}
}
