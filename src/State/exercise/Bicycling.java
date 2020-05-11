package State.exercise;

public class Bicycling implements TravelMode {
    @Override
    public void getDirection() {
        System.out.println("give the bycycling direction");
    }

    @Override
    public void getETA() {
        System.out.println("Bycycling ETA");
    }
}
