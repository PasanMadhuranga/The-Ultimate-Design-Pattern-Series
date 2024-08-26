package prototype.exercise;

public class Clip implements Component {
    private String video_clip;

    public Clip(String video_clip) {
        this.video_clip = video_clip;
    }

    public String getVideo_clip() {
        return video_clip;
    }

    public void setVideo_clip(String video_clip) {
        this.video_clip = video_clip;
    }

    @Override
    public Component clone() {
        return new Clip(video_clip);
    }
}
