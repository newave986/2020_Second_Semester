public class PhoneInterfaceEx implements PhoneInterface { // 인터페이스 구현
    // PhoneInterface의 모든 메소드 구현
    public void sendCall() { System.out.println("Ring"); }
    public void receiveCall() { System.out.println("Hello There"); }

    // Method 추가 작성
    public void flash() { System.out.println("Light On"); }

    // default 메소드 상속
}
