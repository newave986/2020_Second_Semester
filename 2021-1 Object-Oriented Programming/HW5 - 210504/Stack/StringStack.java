public class StringStack implements Stack {
    public int stackSize;
    public int stackNow = 0;
    public String[] stack;

    public StringStack(int stackSize) {
        this.stackSize = stackSize;
        stack = new String[stackSize];
    }

    @Override
    public int length() { return stackSize; }
    @Override
    public int capacity() { return stackSize - stackNow; }
    @Override
    public String pop() { 
        stackNow -= 1;
        return stack[stackNow]; }
    @Override
    public boolean push(String val) {
        if (capacity() != 0) {
            stack[stackNow] = val;
            stackNow += 1 ;
            return true;
        }
        else return false;
    }
}
