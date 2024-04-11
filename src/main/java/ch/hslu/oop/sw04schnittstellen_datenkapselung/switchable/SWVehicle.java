package ch.hslu.oop.sw04schnittstellen_datenkapselung.switchable;

// Vehicle.java
public class SWVehicle implements SWSwitchable {
    private SWMotor SWMotor = new SWMotor();
    private SWAirConditioner SWAirConditioner = new SWAirConditioner();
    private boolean isOn = false;

    @Override
    public void switchOn() {
        isOn = true;
        SWMotor.switchOn();
        SWAirConditioner.switchOn();
    }

    @Override
    public void switchOff() {
        isOn = false;
        SWMotor.switchOff();
        SWAirConditioner.switchOff();
    }

    @Override
    public boolean isSwitchedOn() {
        return isOn;
    }

    @Override
    public boolean isSwitchedOff() {
        return !isOn;
    }
}