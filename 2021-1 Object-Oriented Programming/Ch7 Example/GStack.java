class GStack <T> {
    int tos;
    Object[] stck;
    
    public GStack() {
        tos = 0;
        stck = new Object[10];
    }

    public void push(T item) {
        if (tos == 10) return;
        stck[tos] = item;
        tos += 1;
    }

    public T pop() {
        if (tos == 0) return null;
        // System.out.println(stck[tos]);
        tos -= 1;
        return (T)stck[tos];
    }
}
