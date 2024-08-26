package command.editor;

public class Main {
    public static void main(String[] args) {
        HtmlDocument document = new HtmlDocument();
        document.setContent("Hello World");
        History history = new History();
        BoldCommand bold_command = new BoldCommand(document, history);
        bold_command.execute();
        System.out.println(document.getContent());

        UndoCommand undo = new UndoCommand(history);
        undo.execute();
        System.out.println(document.getContent());
    }
}
