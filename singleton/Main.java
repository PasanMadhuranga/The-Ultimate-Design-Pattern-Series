package singleton;

public class Main {
    public static void main(String[] args) {
        ConfigManager manager = ConfigManager.getInstance();
        manager.set("Name", "Pasan");
        manager.set("Age", 13);

        ConfigManager other = ConfigManager.getInstance();
        System.out.println(other.get("Age"));
    }
}
