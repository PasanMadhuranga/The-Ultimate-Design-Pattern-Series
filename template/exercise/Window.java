package template.exercise;

public class Window {
    public void close() {
        beforeClosed();
        System.out.println("Removing the window from the screen");
        afterClosed();
    }

    protected void beforeClosed() {
        System.out.println("Performing default task before window is closed.");
    }

    protected void afterClosed() {
        System.out.println("Performing default task after window is closed.");
    }
}