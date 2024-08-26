package strategy.exercise;

public class Main {
    public static void main(String[] args) {
        ChatClient client = new ChatClient();
        client.send("Hello Guys", new AesEncryption());
        client.send("Gunsmith", new DesEncryption());
    }
}
