package memento.exercise;

public class Editor {
    private String content;
    private String font_name;
    private int font_size;

    public EditorState createState(){
        return new EditorState(content, font_name, font_size);
    }

    public void restore(EditorState state){
        content = state.getContent();
        font_name = state.getFontName();
        font_size = state.getFontSize();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFont_name() {
        return font_name;
    }

    public void setFont_name(String font_name) {
        this.font_name = font_name;
    }

    public int getFont_size() {
        return font_size;
    }

    public void setFont_size(int font_size) {
        this.font_size = font_size;
    }
}