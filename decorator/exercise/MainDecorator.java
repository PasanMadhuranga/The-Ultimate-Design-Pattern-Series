package decorator.exercise;

public class MainDecorator implements AbstractArtefact {
    private AbstractArtefact artefact;


    public MainDecorator(AbstractArtefact artefact) {
        this.artefact = artefact;
    }

    @Override
    public String render() {
        return "[Main] " + artefact.render();
    }
}
