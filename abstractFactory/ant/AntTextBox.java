package abstractFactory.ant;

import abstractFactory.TextBox;

public class AntTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("rendering Ant Text Box");
    }
}
