interface PhoneInterface {
    public static final int TIMEOUT = 10000;
    public abstract void sendCall();
    public abstract void receiveCall();
    public default void printLogo() {
        System.out.println("** Phone **");
    }
}

// 자바 인터페이스는 객체 생성 불가
// 인터페이스 타입의 레퍼런스 변수를 선언할 수 있다
// 인터페이스 구현 시에는 추상 메소드를 모두 구현한 클래스를 작성