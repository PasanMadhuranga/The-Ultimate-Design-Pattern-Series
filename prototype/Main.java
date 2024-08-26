package prototype;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(34.2);
        ContextMenu contextMenu = new ContextMenu();
        circle.render();
        contextMenu.duplicate(circle);
    }
}
