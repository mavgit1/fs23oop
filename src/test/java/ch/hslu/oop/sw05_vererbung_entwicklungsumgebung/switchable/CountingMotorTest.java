package ch.hslu.oop.sw05_vererbung_entwicklungsumgebung.switchable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountingMotorTest {

    @Test
    public void testSwitchOperations() {
        CountingSwitchable motor = new CountingMotor();
        assertEquals(false, motor.isSwitchedOn(), "Motor sollte initial ausgeschaltet sein");
        assertEquals(0, motor.getSwitchCount(), "Schaltzähler sollte initial 0 sein");

        // Einschalten
        motor.switchOn();
        assertEquals(true, motor.isSwitchedOn(), "Motor sollte eingeschaltet sein");
        assertEquals(1, motor.getSwitchCount(), "Schaltzähler sollte 1 sein nach dem Einschalten");

        // Ausschalten
        motor.switchOff();
        assertEquals(false, motor.isSwitchedOn(), "Motor sollte ausgeschaltet sein");
        assertEquals(2, motor.getSwitchCount(), "Schaltzähler sollte 2 sein nach dem Ausschalten");

        // Erneutes Einschalten
        motor.switchOn();
        assertEquals(true, motor.isSwitchedOn(), "Motor sollte wieder eingeschaltet sein");
        assertEquals(3, motor.getSwitchCount(), "Schaltzähler sollte 3 sein nach erneutem Einschalten");
    }
}
