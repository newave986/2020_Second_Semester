// TV를 상속받은 ColorTV 클래스 정의

class ColorTV extends TV {
    private int size, color;
    public ColorTV(int size, int color) {
        super(size);
        this.size = size; this.color = color;
    }
}