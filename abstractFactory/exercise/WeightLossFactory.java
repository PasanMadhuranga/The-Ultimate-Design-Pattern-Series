package abstractFactory.exercise;

public class WeightLossFactory implements PlanFactory{

    @Override
    public WorkoutPlan createWorkoutPlan() {
        return new WeightLossWorkout();
    }

    @Override
    public MealPlan createMealPlan() {
        return new WeighLossMealPlan();
    }
}
