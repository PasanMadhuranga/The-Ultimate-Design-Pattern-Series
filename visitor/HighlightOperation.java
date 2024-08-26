package visitor;

public class HighlightOperation implements Operation{
    @Override
    public void apply(HeadingNode heading) {
        System.out.println("Highlight heading Node");
    }

    @Override
    public void apply(AnchorNode anchor) {
        System.out.println("Highlight anchor Node");
    }
}
