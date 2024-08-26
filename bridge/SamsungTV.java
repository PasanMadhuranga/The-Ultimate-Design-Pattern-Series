package bridge;

public class SamsungTV implements Device{
    @Override
    public void turnOn() {
        System.out.println("SamsungTV: turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("SamsungTV: turn off");
    }

    @Override
    public void setChannel() {
        System.out.println("SamsungTV: set channel");
    }
}
