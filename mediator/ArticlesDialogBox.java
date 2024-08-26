package mediator;

public class ArticlesDialogBox extends DialogBox{
    private ListBox articles_ListBox = new ListBox(this);
    private TextBox title_TextBox = new TextBox(this);
    private Button save_button = new Button(this);

    public void simulateUserInteraction(){
        articles_ListBox.setSelection("Article 1");
//        title_TextBox.setContent("");
        System.out.println("Text Box: " + title_TextBox.getContent());
        System.out.println("button: " + save_button.isEnable());
    }
    @Override
    public void changed(UIControl ui_control) {
        if (ui_control == articles_ListBox)
            articleSelected();
        else if (ui_control == title_TextBox)
            titleChanged();
    }

    private void articleSelected(){
        title_TextBox.setContent(articles_ListBox.getSelection());
        save_button.setEnable(true);
    }

    private void titleChanged(){
        String content = title_TextBox.getContent();
        boolean is_empty = (content == null || content.isEmpty());
        save_button.setEnable(!is_empty);
    }
}
