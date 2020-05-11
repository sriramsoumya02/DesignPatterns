package State.exercise;

public class Main {
    public static void main(String[] args) {
        Direction myDirection = new Direction();
        myDirection.setTravelMode(new Driving());
        myDirection.getETA();
        myDirection.getDirection();
        myDirection.setTravelMode(new Walking());
        myDirection.getETA();
        myDirection.getDirection();
    }
}
