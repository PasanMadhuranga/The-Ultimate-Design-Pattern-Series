package mediator.exercise;

public class SignUpDialogBox extends DialogBox{
    private TextBox username_textbox = new TextBox(this);
    private TextBox password_textbox = new TextBox(this);
    private CheckBox agree_terms_checkbox = new CheckBox(this);
    private Button sign_up_button = new Button(this);

    public void simulateUserInteraction(){
        username_textbox.setContent("PasanMadhuranga");
        System.out.println("Signup Button: " + sign_up_button.isEnable());
        password_textbox.setContent("kjh736gyBHvtt56789");
        System.out.println("Signup Button: " + sign_up_button.isEnable());
        agree_terms_checkbox.check();
        System.out.println("Signup Button: " + sign_up_button.isEnable());
        agree_terms_checkbox.uncheck();
        System.out.println("Signup Button: " + sign_up_button.isEnable());
    }

    @Override
    public void changed(UIControl uiControl) {
        String username = username_textbox.getContent();
        String password = password_textbox.getContent();
        Boolean checked = agree_terms_checkbox.isChecked();

        if(!(username == null || username.isEmpty()) && !(password == null || password.isEmpty()) && checked){
            sign_up_button.setEnable(true);
        }else {
            sign_up_button.setEnable(false);
        }
    }
}
