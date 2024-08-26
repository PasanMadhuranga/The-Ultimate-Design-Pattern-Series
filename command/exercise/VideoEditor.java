package command.exercise;

public class VideoEditor {
    private String video_label;
    private double video_contrast;

    public void addVideoLabel(String video_label){
        this.video_label = video_label;
    }

    public void changeContrast(double video_contrast){
        this.video_contrast = video_contrast;
    }

    public String getVideo_label() {
        return video_label;
    }

    public double getVideo_contrast() {
        return video_contrast;
    }
}
