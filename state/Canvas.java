package state;

public class Canvas {
    private Tool current_tool;

    public void mouseDown(){
        current_tool.mouseDown();
    }

    public void mouseUp(){
        current_tool.mouseUp();
    }

    public void setCurrent_tool(Tool current_tool){
        this.current_tool = current_tool;
    }

    public Tool getCurrent_tool(){
        return current_tool;
    }
}
