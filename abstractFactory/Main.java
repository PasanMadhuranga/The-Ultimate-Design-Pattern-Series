package abstractFactory;

import abstractFactory.ant.AntWidgetFactory;
import abstractFactory.material.MaterialWidgetFactory;

public class Main {
    public static void main(String[] args) {
        ContactForm contactForm = new ContactForm();
//        MaterialWidgetFactory materialFactory = new MaterialWidgetFactory();
//        contactForm.render(materialFactory);
        AntWidgetFactory antFactory = new AntWidgetFactory();
        contactForm.render(antFactory);
//        new ContactForm().render(new MaterialWidgetFactory());
//        new ContactForm().render(new AntWidgetFactory());
    }
}
