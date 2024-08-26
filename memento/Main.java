package memento;

// Memento Design Pattern is used to implement undo functionality.
public class Main {
    public static void main(String[] args) {
        // The Editor class is the originator. It creates states.
        var editor = new Editor();
        // The History class is the caretaker. It stores the states of the Editor class.
        var history = new History();

        // The Editor class creates a state and pushes it to the History class.
        editor.setContent("a");
        history.push(editor.createState());
        // The Editor class creates a state and pushes it to the History class.
        editor.setContent("b");
        history.push(editor.createState());
        // The Editor class restores the state from the History class.
        editor.setContent("c");
        editor.restore(history.pop());
        // Display the previous state of the Editor class.
        System.out.println(editor.getContent());
    }
}
