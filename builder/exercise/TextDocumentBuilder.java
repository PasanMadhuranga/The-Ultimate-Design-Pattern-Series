package builder.exercise;

public class TextDocumentBuilder implements DocumentBuilder{
    private StringBuilder builder = new StringBuilder();
    @Override
    public void addText(Text text) {
        builder.append(text.getContent());
    }

    @Override
    public void addImage(Image image) {

    }

    @Override
    public String getResult() {
        return builder.toString();
    }
}
