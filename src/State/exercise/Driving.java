package State.exercise;

public class Driving implements TravelMode {
    @Override
    public void getDirection() {
        System.out.println("give the driving direction");
    }

    @Override
    public void getETA() {
        System.out.println("Driving ETA");
    }
}
