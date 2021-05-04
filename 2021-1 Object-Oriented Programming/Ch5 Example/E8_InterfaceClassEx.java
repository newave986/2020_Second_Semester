interface PhoneInterface {
    public static final int TIMEOUT = 10000;
    public abstract void sendCall();
    public abstract void receiveCall();
    public default void printLogo() {
        System.out.println("** Phone **");
    }
}

interface MobilePhoneInterface extends PhoneInterface {
    void sendSMS();
    void receiveSMS();
}

interface MP3Interface {
    public void play();
    public void stop();
}

class PDA {
    public int calculate(int x, int y) { return x+y; }
}

class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface {
    @Override
    public void sendCall() { System.out.println("RingRingRing"); }
    @Override
    public void receiveCall() { System.out.println("Call"); }
    @Override
    public void sendSMS() { System.out.println("Sending SMS"); }
    @Override
    public void play() { System.out.println("Play"); }
    @Override
    public void stop() { System.out.println("Stop"); }
    public void schedule () { System.out.println("Schedule"); }
}

public class E8_InterfaceClassEx {
    public static void main(String[] args) {
        PhoneInterfaceEx phone = new PhoneInterfaceEx();
        phone.printLogo();
        phone.sendCall();
        phone.play();
        System.out.println("3 plus 5 is: " + phone.calculate(3, 5));
        phone.schedule();
    }
}