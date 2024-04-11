package ch.hslu.oop.sw05_vererbung_entwicklungsumgebung.switchable;

public class CountingMotor implements CountingSwitchable, SWNamed {

    private String name;
    private boolean isOn = false;

    private long switchCount = 0;

    @Override
    public void switchOn() {
        if (!isOn) {
            isOn = true;
            switchCount++;
            System.out.println("Motor is now ON.");
        }
    }

    @Override
    public void switchOff() {
        if (isOn) {
            isOn = false;
            switchCount++;
            System.out.println("Motor is now OFF.");
        }
    }

    @Override
    public boolean isSwitchedOn() {
        return isOn;
    }

    @Override
    public boolean isSwitchedOff() {
        return !isOn;
    }

    @Override
    public long getSwitchCount() {
        return switchCount;
    }

    @Override
    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
