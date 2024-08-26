package memento.exercise_modified;

import java.util.Hashtable;

public class Editor {
    private String content;
    private String font_name;
    private int font_size;
    private String font_colour;

    public EditorState createState(){
        Hashtable<String, String> current_contents = new Hashtable<>();
        current_contents.put("Content", content);
        current_contents.put("Font Name", font_name);
        current_contents.put("Font Size", String.valueOf(font_size));
        current_contents.put("Font Colour", String.valueOf(font_colour));
        return new EditorState(current_contents);
    }

    public void restore(EditorState state){
        Hashtable<String, String> prev_contents = state.getContent();
        content = prev_contents.get("Content");
        font_name = prev_contents.get("Font Name");
        font_size = Integer.valueOf(prev_contents.get("Font Size"));
        font_colour = prev_contents.get("Font Colour");
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

    public String getFont_colour() {
        return font_colour;
    }

    public void setFont_colour(String font_colour) {
        this.font_colour = font_colour;
    }
}

