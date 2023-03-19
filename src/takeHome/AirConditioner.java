package takeHome;

public class AirConditioner {
    private String product;
    private boolean isOn;
    private int temperature;

   /*
   public AirConditioner(String name, int temp, boolean state){
        product = name;
        isOn = state;
        temperature = temp;
    }
    */
    public void productName(String name){
        product = name;
    }

    public String getProductName() {
        return product;
    }

    public void onIt(boolean value) {
        isOn = value;
    }

    public boolean getState() {
        return isOn;
    }

    public void temperatureState(int value) {
        if(isOn == false) temperature = 0;
        if(isOn == true) temperature = value;
    }

    public int getTemperatureState() {
        return temperature;
    }

    public void increaseTemperature(int value1) {
        if(isOn == false) temperature = 0;
        if(isOn == true) temperature = value1 + 1;
        if(temperature > 30) temperature = 30;
    }

    public void decreaseTemperature(int value2) {
        if(isOn == false) {
            if (value2 > 16) {
                temperature = 0;
            }
        }
        if(isOn == true){
            if(value2 <= 16) {
                temperature = 16;
            }
        }
        if(isOn == false) temperature = 0;
        if(isOn == true) temperature = value2 - 1;

    }

}
