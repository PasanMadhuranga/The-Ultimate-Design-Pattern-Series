package beverageMachine;

import java.util.ArrayList;
import java.util.Objects;

public class BeverageMachine {
    private int cup_id;
    private ArrayList<String> tea_coffee_count = new ArrayList<>();

    public BeverageMachine() {
        this.cup_id = 1000;
    }

    public void produceCup(String type){
        if (type.equals("tea")){
            System.out.println("Tea Cup");
            tea_coffee_count.add("T" + cup_id++);
        } else if (type.equals("coffee")) {
            System.out.println("Coffee Cup");
            tea_coffee_count.add("C" + cup_id++);
        } else if (type.equals("water")) {
            System.out.println("Water Cup");
        }else {
            System.out.println("Wrong type");
        }
    }

    public void calculateCalories(){
        String last_cup_id = tea_coffee_count.get(tea_coffee_count.size() - 1);
        if (last_cup_id.charAt(0) == 'T'){
            System.out.println("1000 Calories in the Tea cup"); // Add the algorithm to calculate calories of a tea cup
                                                                // instead of this print statement
        } else if (last_cup_id.charAt(0) == 'C') {
            System.out.println("1200 Calories in the Tea cup"); // Add the algorithm to calculate calories of a coffee cup
                                                                // instead of this print statement
        }
    }

    public int getTotalCoffeeTea(){
        return tea_coffee_count.size();
    }
}
