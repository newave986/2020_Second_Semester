public class MethodEx {

    public int getSum(int i, int j) {
        return i + j;
    }

    public int getSum(int i) {
        return i + 1;
    }

    // public int getSum2(int i) {
    //     return i + 1;
    // }

    public static void main(String[] args) {
        MethodEx x = new MethodEx();
        System.out.println(x.getSum(1, 2));
        System.out.println(x.getSum2(1));
    }

}
