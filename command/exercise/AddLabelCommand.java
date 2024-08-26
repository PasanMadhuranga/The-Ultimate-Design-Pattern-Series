package command.exercise;

public class AddLabelCommand implements VideoCommand{
    private VideoEditor videoEditor;
    private String label;
    private String prev_label;

    public AddLabelCommand(VideoEditor videoEditor, String label) {
        this.videoEditor = videoEditor;
        this.label = label;
    }


    @Override
    public void execute() {
        prev_label = videoEditor.getVideo_label();
        videoEditor.addVideoLabel(label);
    }

    @Override
    public void undo() {
        videoEditor.addVideoLabel(prev_label);
    }
}
