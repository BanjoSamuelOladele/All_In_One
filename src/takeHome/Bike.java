package takeHome;

public class Bike {
    private boolean isOn;
    private String gear;
    private int accelerateVal;

    public void bikeOn(boolean value) {
        isOn = value;
    }

    public boolean callBike() {
        return isOn;
    }

    public void setGear(String value) {
        if(isOn == true) gear = value;
        if(isOn == false) gear = "bike is switched off";
    }

    public String getGear() {
        return gear;
    }

    public void accelerated(int value) {
        if(isOn == false) accelerateVal = 0;
        if(isOn == true) accelerateVal = value;
        if(isOn == false){
            if(value > 0) {
                accelerateVal = 0;
            }
            if(value > 20) {
                accelerateVal = 0;
            }
            if(value > 30) {
                accelerateVal = 0;
            }
            if(value > 40) {
                accelerateVal = 0;
            }
        }
        if(value > 0) accelerateVal = value + 1;
        if(value > 20) accelerateVal = value + 2;
        if(value > 30) accelerateVal = value + 3;
        if(value > 40) accelerateVal = value +4;
    }

    public int getAccerated() {
        return accelerateVal;
    }
}
