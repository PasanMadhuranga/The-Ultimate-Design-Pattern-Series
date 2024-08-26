package memento.exercise_modified;

// Memento Design Pattern is used to implement undo functionality.
public class Main {
    public static void main(String[] args) {
        // The Editor class is the originator. It creates states.
        var editor = new Editor();
        // The History class is the caretaker. It stores the states of the Editor class.
        var history = new History();

        // The Editor class creates a state and pushes it to the History class.
        editor.setContent("a");
        editor.setFont_name("Calibri");
        editor.setFont_size(18);
        editor.setFont_colour("Red");
        history.push(editor.createState());
        // The Editor class creates a state and pushes it to the History class.
        editor.setContent("b");
        editor.setFont_size(12);
        history.push(editor.createState());
        // The Editor class restores the state from the History class.
        editor.setContent("c");
        editor.setFont_colour("Green");
        editor.setFont_colour("Black");
        editor.restore(history.pop());
        // Display the previous state of the Editor class.
        System.out.println(editor.getContent()); // Output: b Calibri 12 Red
        System.out.println(editor.getFont_name());
        System.out.println(editor.getFont_size());
        System.out.println(editor.getFont_colour());
    }
}
