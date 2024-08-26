package memento.exercise;

import java.util.ArrayList;
import java.util.List;

public class History {
    List<EditorState> states = new ArrayList<>();

    public void push(EditorState state){
        states.add(state);
    }

    public EditorState pop(){
        int last_index = states.size() - 1;
        EditorState last_state = states.get(last_index);
        states.remove(last_index);
        return last_state;
    }
}
