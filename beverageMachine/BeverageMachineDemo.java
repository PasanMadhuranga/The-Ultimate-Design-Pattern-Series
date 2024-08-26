package beverageMachine;

import java.util.Scanner;

public class BeverageMachineDemo {
    public static void main(String[] args) {
        BeverageMachine beverage_machine = new BeverageMachine();
        Scanner scanner =  new Scanner(System.in);
        while (true){
            String user_input = scanner.nextLine();
            if (user_input.charAt(0) == '0'){
                beverage_machine.produceCup(user_input.substring(1));
            } else if (user_input.equals("1")) {
                beverage_machine.calculateCalories();
            } else if (user_input.equals("2")) {
                System.out.println(beverage_machine.getTotalCoffeeTea());
            }else {
                System.out.println("Invalid input");
                break;
            }
        }
    }
}

