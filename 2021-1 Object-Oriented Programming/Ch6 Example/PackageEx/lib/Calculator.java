package PackageEx.lib;

public abstract class Calculator {
	public abstract int add(int a, int b);
	public abstract int subtract(int a, int b);
	public abstract double average(int[] a);
}

// PackageEx.app에서도 접근할 수 있도록
// public 제어자 삽입