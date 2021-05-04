// Q1의 ColorTV를 상속받는 IPTV 만들기

class IPTV extends ColorTV {
    private String ip;
    public void IPTV(String ip, int size, int color) {
        super(size, color);
        this.ip = ip; 
    }
    public void printProperty() {
        System.out.print("나의 IPTV는 " + ip + " 주소의 " + size + "인치 " + color + "컬러");
    }
}