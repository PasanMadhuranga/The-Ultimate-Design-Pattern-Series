package mediator.using_observer;

public class Button extends UIControl {
    private boolean is_enable;

    public boolean isEnable() {
        return is_enable;
    }

    public void setEnable(boolean is_enable) {
        this.is_enable = is_enable;
        notifyEventHandlers();
    }
}
