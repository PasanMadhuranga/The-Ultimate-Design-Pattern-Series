package prototype.exercise;

public class Audio implements Component {
    private String audio_file;

    public Audio(String audio_file) {
        this.audio_file = audio_file;
    }

    public String getAudio_file() {
        return audio_file;
    }

    public void setAudio_file(String audio_file) {
        this.audio_file = audio_file;
    }

    @Override
    public Component clone() {
        return new Audio(audio_file);
    }
}
