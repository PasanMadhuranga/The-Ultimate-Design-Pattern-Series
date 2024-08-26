package mediator.exercise;

public class CheckBox extends UIControl {
    private boolean checked;

    public CheckBox(DialogBox owner) {
        super(owner);
    }

    public void check(){
        checked = true;
        owner.changed(this);
    }

    public void uncheck(){
        checked = false;
        owner.changed(this);
    }

    public boolean isChecked(){
        return checked;
    }
}
