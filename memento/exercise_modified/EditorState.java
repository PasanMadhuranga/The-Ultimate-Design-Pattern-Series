package memento.exercise_modified;

import java.util.Hashtable;
import java.util.Stack;

public class EditorState {
    private Stack<Hashtable> all_contents = new Stack<>();

    public EditorState(Hashtable current_contents) {
        all_contents.push(current_contents);
    }

    public Hashtable getContent() {
        return all_contents.pop();
    }
}
