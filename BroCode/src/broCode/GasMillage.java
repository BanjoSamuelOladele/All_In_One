package broCode;

public class GasMillage {
    private int milesTaken;
    private int fuelUsed;

    public int milesPerTrip() {
        return milesTaken;
    }

    public int fuelConsumed() {
        return fuelUsed;
    }

    public void tripDistance(int milesTaken) {
        this.milesTaken = milesTaken;
    }

    public void consumedFuel(int fuelUsed) {
        this.fuelUsed = fuelUsed;
    }

    public int getTotal() {
        return 0;
    }
}
