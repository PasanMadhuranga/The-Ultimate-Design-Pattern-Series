package memento.exercise;

public class EditorState {
    private String content;
    private String font_name;
    private int font_size;

    public EditorState(String content, String font_name, int font_size) {
        this.content = content;
        this.font_name = font_name;
        this.font_size = font_size;
    }

    public String getContent() {
        return content;
    }

    public String getFontName() {
        return font_name;
    }

    public int getFontSize() {
        return font_size;
    }
}
