package command.exercise;

public class ChangeContrastCommand implements VideoCommand{
    VideoEditor videoEditor;
    double contrast;
    double prev_contrast;

    public ChangeContrastCommand(VideoEditor videoEditor, double contrast) {
        this.videoEditor = videoEditor;
        this.contrast = contrast;
    }

    @Override
    public void execute() {
        prev_contrast = videoEditor.getVideo_contrast();
        videoEditor.changeContrast(contrast);
    }

    @Override
    public void undo() {
        videoEditor.changeContrast(prev_contrast);
    }
}
