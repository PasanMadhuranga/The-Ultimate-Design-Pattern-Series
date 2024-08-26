package mediator.using_observer;

public class ArticlesDialogBox{
    private ListBox articles_ListBox = new ListBox();
    private TextBox title_TextBox = new TextBox();
    private Button save_button = new Button();

    public ArticlesDialogBox(){
//        Method 1
//        articles_ListBox.addEventHandler(new EventHandler() {
//            @Override
//            public void handle() {
//                articleSelected();
//            }
//        });
//
//        Method 2
//        articles_ListBox.addEventHandler(() -> articleSelected());

//        Method 3
        articles_ListBox.addEventHandler(this::articleSelected);
        title_TextBox.addEventHandler(this::titleChanged);
    }

    public void simulateUserInteraction(){
        articles_ListBox.setSelection("Article 1");
//        title_TextBox.setContent("");
        System.out.println("Text Box: " + title_TextBox.getContent());
        System.out.println("button: " + save_button.isEnable());
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
