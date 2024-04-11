package ch.hslu.oop.sw04schnittstellen_datenkapselung.switchable;

// AirConditioner.java
public class SWAirConditioner implements SWSwitchable {
    private boolean isOn = false;

    @Override
    public void switchOn() {
        isOn = true;
    }

    @Override
    public void switchOff() {
        isOn = false;
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