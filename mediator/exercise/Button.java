package mediator.exercise;

public class Button extends UIControl {
    private boolean enable;

    public Button(DialogBox owner) {
        super(owner);
    }

    public void setEnable(boolean set_enable){
        enable = set_enable;
    }

    public boolean isEnable(){
        return enable;
    }
}
