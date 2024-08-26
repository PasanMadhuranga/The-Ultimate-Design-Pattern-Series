package state.exsercise;

public class Main {
    public static void main(String[] args){
        DirectionService direction_service = new DirectionService();
        direction_service.setCurrentCurrentMode(new DrivingMode());
        direction_service.getDirection();
        direction_service.getEta();

        direction_service.setCurrentCurrentMode(new WalkingMode());
        direction_service.getDirection();
        direction_service.getEta();
    }
}
