package state;

public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.setCurrent_tool(new SelectionTool());
        canvas.mouseDown(); // Output: Selection icon
        canvas.mouseUp(); // Output: Draw a dashed rectangle

        canvas.setCurrent_tool(new BrushTool());
        canvas.mouseDown(); // Output: Brush icon
        canvas.mouseUp(); // Output: Draw a line
    }
}
