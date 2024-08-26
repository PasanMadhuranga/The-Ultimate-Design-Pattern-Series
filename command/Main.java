package command;

import command.framework.Button;
import command.framework.Command;

public class Main {
    public static void main(String[] args) {
        CustomerService service = new CustomerService();
        Command command = new AddCustomerCommand(service);
        Button add_customer_button = new Button(command);
        add_customer_button.click();
    }
}
