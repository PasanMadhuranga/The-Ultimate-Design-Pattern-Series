package bridge;

public class SonyTV implements Device{
    @Override
    public void turnOn() {
        System.out.println("SonyTV: turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("SonyTV: turn off");
    }

    @Override
    public void setChannel() {
        System.out.println("SonyTV: turn set channel");
    }
}
