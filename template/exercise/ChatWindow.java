package template.exercise;

public class ChatWindow extends Window {
    @Override
    protected void afterClosed() {
        System.out.println("remove listeners...");
    }
}
