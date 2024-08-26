package visitor;

public class Main {
    public static void main(String[] args) {
        HtmlDocument html_document = new HtmlDocument();

        html_document.add(new HeadingNode());
        html_document.add(new AnchorNode());

        html_document.execute(new HighlightOperation());
        html_document.execute(new PlainTextOperation());
    }
}
