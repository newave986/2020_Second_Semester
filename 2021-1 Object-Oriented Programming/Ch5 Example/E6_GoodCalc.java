public class E6_GoodCalc extends Calculator {
    @Override
    public int add(int a, int b) { return a+b; }
    @Override
    public int subtract(int a, int b) { return a-b; }
    @Override
    public double average(int[] a) { return sum(a)/a.length; }

    public static void main(String[] args) {
        E6_GoodCalc c = new E6_GoodCalc();
        System.out.println(c.add(2, 3));
        System.out.println(c.substract(2, 3));
        System.out.println(c.average(new int[] { 2, 3, 4 }));
    }
}