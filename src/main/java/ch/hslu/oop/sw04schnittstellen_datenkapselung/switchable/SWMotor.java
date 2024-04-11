package ch.hslu.oop.sw04schnittstellen_datenkapselung.switchable;

public class SWMotor implements SWSwitchable {
    private boolean isOn = false; // Standardmäßig ist der Motor ausgeschaltet.

    @Override
    public void switchOn() {
        isOn = true;
        System.out.println("Motor is now ON.");
    }

    @Override
    public void switchOff() {
        isOn = false;
        System.out.println("Motor is now OFF.");
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
