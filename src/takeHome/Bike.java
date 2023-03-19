package takeHome;

public class Bike {
    private boolean isOn;

    public void bikeOn(boolean value) {
        isOn = value;
    }

    public boolean callBike() {
        return isOn;
    }
}
