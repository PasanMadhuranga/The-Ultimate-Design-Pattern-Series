package abstractFactory.exercise;

public class Main {
    public static void main(String[] args) {
        var homePage = new HomePage();
        homePage.setGoal(new BuildMuscleFactory());
    }
}
