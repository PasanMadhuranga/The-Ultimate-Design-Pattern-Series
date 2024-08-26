package prototype;

public class ContextMenu {
    public void duplicate(Component component){
        Component new_Component = component.clone();
        // Add target to the document
        new_Component.render();
    }
}
