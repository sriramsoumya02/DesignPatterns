package State.exercise;

public class Transit implements TravelMode {
    @Override
    public void getDirection() {
        System.out.println("give the Transit direction");
    }

    @Override
    public void getETA() {
        System.out.println("Transit ETA");
    }
}
