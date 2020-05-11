package State.exercise;

public class Direction {
    TravelMode travelMode;

    public TravelMode getTravelMode() {
        return travelMode;
    }

    public void setTravelMode(TravelMode travelMode) {
        this.travelMode = travelMode;
    }

    public void getDirection() {
        travelMode.getDirection();
    }

    public void getETA() {
        travelMode.getETA();
    }
}
