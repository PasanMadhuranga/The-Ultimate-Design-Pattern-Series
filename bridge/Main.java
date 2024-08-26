package bridge;

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl(new SonyTV());
        remoteControl.turnOn();
        remoteControl.turnOff();

        AdvancedRemoteControl advancedRemoteControl = new AdvancedRemoteControl(new SamsungTV());
        advancedRemoteControl.turnOn();
        advancedRemoteControl.turnOff();
        advancedRemoteControl.setChannel();
    }
}
