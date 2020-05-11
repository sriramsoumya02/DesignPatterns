package State.exercise;

public class Walking implements TravelMode {
    @Override
    public void getDirection() {
        System.out.println("give the walking direction");
    }

    @Override
    public void getETA() {
        System.out.println("walking ETA");
    }
}
