package command.exercise;

public class Main {
    public static void main(String[] args) {
        VideoEditor videoEditor = new VideoEditor();
        VideoEditingApp videoEditingApp = new VideoEditingApp();

        videoEditingApp.executeCommand(new ChangeContrastCommand(videoEditor, 12));
        videoEditingApp.executeCommand(new AddLabelCommand(videoEditor, "First Label"));
        videoEditingApp.executeCommand(new AddLabelCommand(videoEditor, "Second Label"));
        videoEditingApp.executeCommand(new ChangeContrastCommand(videoEditor, 20));

        videoEditingApp.undoCommand();
        videoEditingApp.undoCommand();

        System.out.println(videoEditor.getVideo_label());
        System.out.println(videoEditor.getVideo_contrast());
    }
}
